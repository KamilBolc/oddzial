package ustawienia;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by mariusz on 09.12.16.
 */
public class UstawieniaLoader {

    private final String nazwaPliku;

    public UstawieniaLoader(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }


    public Ustawienia zaladuj() {

        Properties properties = new Properties();
        try {
            Ustawienia ustawienia = new Ustawienia();

            properties.load(new FileInputStream(this.nazwaPliku));
            ustawienia.setURL(properties.getProperty("URL"));
            ustawienia.setSciezkaCSV(properties.getProperty("SCIEZKA_CSV"));
            ustawienia.setCHROME(properties.getProperty("SCIEZKA_CHROME"));
            ustawienia.setGECKO(properties.getProperty("SCIEZKA_GECKODRIVER"));
            ustawienia.setDB_CONNECT(properties.getProperty("MYSQL_SERVER_URL"));
            ustawienia.setPORT(properties.getProperty("MYSQL_SERVER_PORT"));
            ustawienia.setBAZA(properties.getProperty("MYSQL_DB_NAME"));
            ustawienia.setHasloSQL(properties.getProperty("MYSQL_DB_PASSWORD"));
            ustawienia.setUzytkownikSQL(properties.getProperty("MYSQL_DB_USERNAME"));
            ustawienia.setCronOdetki(properties.getProperty("CRON_ODSETKI"));
            ustawienia.setCronProwizje(properties.getProperty(("CRON_NALICZANIE_PROWIZJI")));
            ustawienia.setWidokKlienta(properties.getProperty("WIDOK_KLIENTA"));
            ustawienia.setProlongata(properties.getProperty("CRON_PROLONGATA"));
            ustawienia.setSciezkaDoRaportow(properties.getProperty("SCIEZKA_DO_RAPORTOW"));
            ustawienia.setDoradca(properties.getProperty("DORADCA"));
            ustawienia.setHasloOdzial(properties.getProperty("HASLO_ODDZIAL"));
            ustawienia.setWysylkaSMSGeneruj(properties.getProperty("WYSYLKA_SMS_GENEROWANIE"));
            ustawienia.setWysylkaSMSWeryfikuj(properties.getProperty("WYSYLKA_SMS_WERYFIKUJ"));
            ustawienia.setWysylkaSMSWyslij(properties.getProperty("WYSYLKA_SMS_WYSYLANIE"));
            ustawienia.setLoginAdmina(properties.getProperty("ADMIN"));
            ustawienia.setHasloCentrala(properties.getProperty("HASLO_CENTRALA"));
            ustawienia.setMonitoring(properties.getProperty("MONITORING"));
            ustawienia.setWysylkaMasowa(properties.getProperty("WYSYLKA_MASOWA"));
            ustawienia.setWysylkaMasowa2(properties.getProperty("WYSYLKA_MASOWA2"));
            ustawienia.setZmienStatusKlienta(properties.getProperty("ZMIEN_STATUS_KLIENTA"));
            ustawienia.setZmienStatusKlienta(properties.getProperty("PRZENIES_NA_MONITORING"));
            return ustawienia;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}
