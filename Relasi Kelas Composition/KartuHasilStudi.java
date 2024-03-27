package RelasiKelasComposition;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;           
    private double ips;                    
    private List<MataKuliah> daftarMataKuliah;

    //untuk membuat objek KartuHasilStudi dengan parameter semester
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>(); 
    }

    // untuk menambahkan mata kuliah ke dalam daftar
    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // untuk menghitung IPS dari daftar mata kuliah dalam KHS
    public void hitungIPS() {
        double totalBobot = 0;
        double totalSKS = 0;

        // Untuk Melakukan iterasi untuk setiap mata kuliah dalam daftar
        for (MataKuliah mk : daftarMataKuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSks(); // Menambahkan bobot untuk setiap mata kuliah
            totalSKS += mk.getSks(); // Menambahkan total SKS
        }

        // Menghitung IPS berdasarkan total bobot dan total SKS
        if (totalSKS != 0) {
            ips = totalBobot / totalSKS;
        } else {
            ips = 0;
        }
    }

    // untuk mendapatkan nilai IPS dari KHS
    public double getIPS() {
        return ips;
    }

    // untuk menampilkan informasi mengenai daftar mata kuliah dalam KHS
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display()); 
            sb.append("\n"); 
        }
        return sb.toString();
    }

    /* Setter & Getter */

    // mendapatkan semester dari KHS
    public String getSemester() {
        return semester;
    }

    // mengatur semester KHS
    public void setSemester(String semester) {
        this.semester = semester;
    }

    // mendapatkan daftar mata kuliah dalam KHS
    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }

    // mengatur daftar mata kuliah dalam KHS
    public void setDaftarMataKuliah(List<MataKuliah> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }
}
