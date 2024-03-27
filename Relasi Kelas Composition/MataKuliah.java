package RelasiKelasComposition;

public class MataKuliah {

    private String kode;  // Kode mata kuliah
    private String nama;  // Nama mata kuliah
    private String index; // Indeks nilai mata kuliah
    private int sks;      // Jumlah SKS 

    // untuk membuat objek MataKuliah dengan parameter yang diberikan
    public MataKuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    // untuk mendapatkan jumlah SKS dari mata kuliah
    public int getSks() {
        return sks;
    }

    // untuk mengembalikan nilai index dari mata kuliah
    public double nilaiIndex() {
        switch (index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0; // Mengembalikan 0.0 jika indeks tidak valid
        }
    }

    // untuk menampilkan informasi lengkap tentang mata kuliah
    public String display() {
        return kode + " - " + nama + " - " + index + " - " + sks;
    }
}
