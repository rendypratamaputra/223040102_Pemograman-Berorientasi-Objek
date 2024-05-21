package TugasPBO;

//Kelas MahasiswaS1
public class MahasiswaS1 extends Mahasiswa implements Beasiswa {
 private double biayaSPP;

 public MahasiswaS1(String nama, String nim, double ipk, double biayaSPP) {
     super(nama, nim, ipk);
     this.biayaSPP = biayaSPP;
 }

 @Override
 public double hitungBiayaSPP() {
     return biayaSPP;
 }

 @Override
 public double hitungBeasiswa(double ipk) {
     // Menghitung beasiswa berdasarkan IPK
     if (ipk >= 3.5) {
         return 2000000;
     } else if (ipk >= 3.0) {
         return 1000;
     } else {
         return 0;
     }
 }
}
