package pomoc;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by trzaska on 15.12.16.
 */
public class OperacjeNaDacie {
    private GregorianCalendar dataGregorianCalendar;

    public OperacjeNaDacie() throws ClassNotFoundException, SQLException, ParseException {
        this.dataGregorianCalendar = pobierzDateBierzaca();
    }


    private GregorianCalendar pobierzDateBierzaca() throws ClassNotFoundException, SQLException, ParseException {
        DBConnectionPomoc dbConnection = new DBConnectionPomoc("szpik");

        List dat = (List) dbConnection.listaZBazy(dbConnection.pobierzZBazy(), "select wartosc from ustawienia_systemowe where id = 6;", "wartosc");
        String data = (String) dat.get(0);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        if (!data.isEmpty()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(data);
            gregorianCalendar.setTime(date);
        }

        return gregorianCalendar;

    }

    public String getDzienTygodnia() throws ParseException, SQLException, ClassNotFoundException {
        GregorianCalendar g = pobierzDateBierzaca();
        String[] nazwyDniTygodnia = new DateFormatSymbols().getShortWeekdays();
        return nazwyDniTygodnia[g.get(Calendar.DAY_OF_WEEK)];
    }

    public String getDataSystemowa() throws ParseException, SQLException, ClassNotFoundException {

        GregorianCalendar g = dataGregorianCalendar;
        return g.get(Calendar.YEAR) + "-" + (g.get(Calendar.MONTH) + 1) + "-" + g.get(Calendar.DAY_OF_MONTH);
    }


    public void zmianaDaty(int iloscDni) throws SQLException, ClassNotFoundException {

        DBConnectionPomoc dbConnection = new DBConnectionPomoc("szpik");
        GregorianCalendar gregorianCalendar;
        gregorianCalendar = dataGregorianCalendar;
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, iloscDni);
        dbConnection.aktualizujWartosc("ustawienia_systemowe",
                "wartosc",
                String.valueOf(gregorianCalendar.get(Calendar.YEAR)) + "-"
                        + (gregorianCalendar.get(Calendar.MONTH) + 1) + "-" +
                        (gregorianCalendar.get(Calendar.DAY_OF_MONTH)),
                "id",
                "6");

    }


}
