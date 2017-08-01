package pomoc;


import java.sql.SQLException;

/**
 * Created by trzaska on 05.01.17.
 */
public class PobranieNaliczonychKosztowPomoc {

    private double pobierzNaleznyKoszt(int idPozyczki, String dataWymagalnosci, int idGrupy) throws ClassNotFoundException, SQLException {

        String sql = "SELECT sum(kwota_nalezna) FROM `koszty_ewidencja` " +
                "WHERE `id_pozyczki` = '" + idPozyczki + "' AND id_grupy =" + idGrupy + " AND data_wymagalnosci ='" + dataWymagalnosci + "'";
        DBConnectionPomoc dbConnectionPomoc = new DBConnectionPomoc("szpik");


        String kwota = (String) dbConnectionPomoc.listaZBazy(dbConnectionPomoc.pobierzZBazy(), sql, "sum(kwota_nalezna)").get(0);
        double kwotaNalezna;
        if (kwota.isEmpty()) {
            kwotaNalezna = 0;
        } else {
            kwotaNalezna = Double.parseDouble(kwota) / 100;
        }
        return kwotaNalezna;
    }


    public double pobierzOdsetki(int idPozyczki, String dataWymagalnosci) throws SQLException, ClassNotFoundException {
        return this.pobierzNaleznyKoszt(idPozyczki, dataWymagalnosci, 8);
    }

    public double pobierzProwizjaOperacyjna(int idPozyczki, String dataWymagalnosci) throws SQLException, ClassNotFoundException {
        return this.pobierzNaleznyKoszt(idPozyczki, dataWymagalnosci, 35);
    }

    public double pobierzProwizjaZaUdzielenie(int idPozyczki, String dataWymagalnosci) throws SQLException, ClassNotFoundException {
        return this.pobierzNaleznyKoszt(idPozyczki, dataWymagalnosci, 38);
    }

    public double pobierzOplatyPrzedZawarciemUmowy(int idPozyczki, String dataWymagalnosci) throws SQLException, ClassNotFoundException {
        return this.pobierzNaleznyKoszt(idPozyczki, dataWymagalnosci, 36);
    }
}

