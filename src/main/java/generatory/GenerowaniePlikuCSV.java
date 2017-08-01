package generatory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by trzaska on 05.01.17.
 */
public class GenerowaniePlikuCSV {

    FileWriter writer = null;
    BufferedWriter bw;


    private File tworzenieStrukturyKatalogow(String sciezka, String nazwaPliku) {
        File file = new File(sciezka);
        file.mkdirs();
        file = new File(sciezka + nazwaPliku + ".csv");
        return file;
    }

    public void zapisDoPliku(String sciezka, String nazwaPliku, boolean czyNieNadpisacPliku, String tresc) throws IOException {

        writer = new FileWriter(tworzenieStrukturyKatalogow(sciezka, nazwaPliku), czyNieNadpisacPliku);
        bw = new BufferedWriter(writer);

        try {

            bw.write(tresc);
            bw.newLine();
        } catch (IOException e) {
            System.out.print(e);
        }
        zamknijPlik();
    }

    private void zamknijPlik() {
        try {
            bw.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
