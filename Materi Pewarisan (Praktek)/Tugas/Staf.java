package Tugas_Pbo_Perusahaan;

public class Staf extends Karyawan {
    private String divisi;

    // Constructor
    public Staf(String nama, String alamat, double gaji, String divisi) {
        super(nama, alamat, gaji);
        this.divisi = divisi;
    }

    // Getter dan setter
    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    // Metode lain yang diperlukan
    // ...
}
