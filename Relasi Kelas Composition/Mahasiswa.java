package RelasiKelasComposition;

public class Mahasiswa {

    private String NRP;
    private String nama; 
   
	// untuk membuat objek Mahasiswa dengan parameter yang diberikan
	 public Mahasiswa(String NRP, String nama) {
        this.NRP = NRP;
        this.nama = nama;
    }
    
    // untuk menampilkan informasi lengkap tentang mahasiswa
    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    /* Setter & Getter */

    // untuk mendapatkan NRP mahasiswa
    public String getNRP() {
        return NRP;
    }

    // untuk mengatur NRP mahasiswa
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    // untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // untuk mengatur nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }
}
