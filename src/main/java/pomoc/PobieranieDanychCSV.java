package pomoc;

import com.opencsv.CSVReader;
import ustawienia.Ustawienia;
import ustawienia.UstawieniaLoader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by kamil on 18.07.17.
 */
public class PobieranieDanychCSV {


    UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/auth_properties.properties");
    Ustawienia ustaw = ustawieniaLoader.zaladuj();

    private ArrayList<String> pesele = new ArrayList<String>();

    public void pobierzDaneCSV() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(ustaw.getSciezkaCSV()));
        String[] csvCell;
        while ((csvCell = reader.readNext()) != null) {
            String pesel = csvCell[1];
            this.pesele.add(pesel);
        }
    }

    public static void main(String args[]) throws IOException {
        UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/auth_properties.properties");
        Ustawienia ustaw = ustawieniaLoader.zaladuj();
        CSVReader reader = new CSVReader(new FileReader(ustaw.getSciezkaCSV()));
        String[] csvCell;
        while ((csvCell = reader.readNext()) != null) {
            String pesel = csvCell[1];
            System.out.println(pesel);
        }

    }
}


