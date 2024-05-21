package KelasAbstrakInterface;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung() {
        super(0); // panggil constructor superclass dengan nilai jari2 default 0
    }

    public Tabung(int jari2, int tinggi) {
        super(jari2); // panggil constructor superclass dengan nilai jari2 yang diberikan
        this.tinggi = tinggi;
    }

    /*
     * L: 2m . r (r+t)
     */
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Setter & Getter for 'tinggi'
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}

