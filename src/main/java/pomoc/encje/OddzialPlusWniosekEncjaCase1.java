package pomoc.encje;

/**
 * Created by kamil on 21.06.17.
 */
public class OddzialPlusWniosekEncjaCase1 {

    private int plec;
    private String kodPocztowy;
    private String liczbaDzieci;

    public OddzialPlusWniosekEncjaCase1(int plec, String kodPocztowy, String liczbaDzieci) {
        this.plec = plec;
        this.kodPocztowy = kodPocztowy;
        this.liczbaDzieci = liczbaDzieci;
    }

    public int getPlec() {
        return plec;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getLiczbaDzieci() {
        return liczbaDzieci;
    }
}
