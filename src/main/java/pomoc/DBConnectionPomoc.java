package pomoc;


import ustawienia.*;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import java.util.Objects;


public class DBConnectionPomoc {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL;
    private static String USER;
    private static String PASS;

    private Connection connection;

    public DBConnectionPomoc(String baza) throws ClassNotFoundException {
        UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/auth_properties.properties");
        Ustawienia ustawienia = ustawieniaLoader.zaladuj();
        try {
            DB_URL = "jdbc:mysql://" + ustawienia.getDB_CONNECT() + ustawienia.getPORT() + "/" + baza + "?zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=UTF-8&characterSetResults=UTF-8";

            Class.forName(JDBC_DRIVER);

        } catch (ClassNotFoundException e) {
            System.out.print(e);
        }
    }


    public static String prepareSQL(String[] columnsList, String table) {
        String sql = "SELECT ";
        for (String column : columnsList) {
            sql += column;
            sql += !Objects.equals(column, columnsList[columnsList.length - 1]) ? ", " : " ";
        }
        return sql + "FROM " + table;
    }

    private void connect() throws SQLException {
        UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/auth_properties.properties");
        Ustawienia ustawienia = ustawieniaLoader.zaladuj();
        try {
            connection = DriverManager.getConnection(DB_URL, ustawienia.getUzytkownikSQL(), ustawienia.getHasloSQL());
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    private final void close() throws SQLException {
        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement pobierzZBazy() throws SQLException {
        connect();
        return connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }

    public ResultSet getResultSet(Statement statement, String sql) throws SQLException {

        return statement.executeQuery(sql);
    }

    public void aktualizujWartosc(String tabela, String kolumna, String wartosc, String warunekWhere, String wartoscWarunkuWhere)
            throws SQLException {

        connect();
        PreparedStatement ps = getConnection().prepareStatement(
                "UPDATE " + tabela + " SET " + kolumna + " = ? WHERE " + warunekWhere + " =  ?;");

        ps.setString(1, wartosc);
        ps.setString(2, wartoscWarunkuWhere);
        ps.executeUpdate();
        ps.close();

        close();
    }


    public void delete(String sql)
            throws SQLException {

        connect();
        PreparedStatement ps = getConnection().prepareStatement(sql);

        ps.executeUpdate();

        close();
    }

    public List listaZBazy(Statement statement, String sql, String kolumna) throws SQLException {
        List lista = new ArrayList();
        try {

            String pole;
            ResultSet resultSet = getResultSet(statement, sql);

            while (resultSet.next()) {
                pole = resultSet.getString(kolumna);
                lista.add(pole);
            }
        } catch (SQLException se) {
            System.out.print(se);
            lista.add(se);

        } finally {
            close();
            return lista;
        }


    }

    public Statement createReadOnlyForwardStatement() {
        return null;
    }


}