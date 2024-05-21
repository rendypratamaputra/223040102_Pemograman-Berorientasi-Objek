package TugasPBO;

//Kelas Main
public class Main {
 public static void main(String[] args) {
     // Membuat objek MahasiswaS1
     MahasiswaS1 mahasiswa = new MahasiswaS1("Suripto Al Husein", "22304410", 3.6, 3700000);
     
     // Menghitung biaya SPP
     double biayaSPP = mahasiswa.hitungBiayaSPP();
     System.out.println("Nama: " + mahasiswa.getNama());
     System.out.println("NIM: " + mahasiswa.getNim());
     System.out.println("Biaya SPP: Rp" + biayaSPP);
     
     // Menghitung beasiswa
     double beasiswa = mahasiswa.hitungBeasiswa(mahasiswa.getIpk());
     System.out.println("Beasiswa: Rp" + beasiswa);
     
     // Menghitung total yang harus dibayar
     double total = biayaSPP - beasiswa;
     System.out.println("Total yang harus dibayar: Rp" + total);
 }
}
