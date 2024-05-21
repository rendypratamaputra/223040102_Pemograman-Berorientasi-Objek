package TugasPBO;

//Kelas abstrak Mahasiswa
public abstract class Mahasiswa {
private String nama;
private String nim;
private double ipk;

public Mahasiswa(String nama, String nim, double ipk) {
   this.nama = nama;
   this.nim = nim;
   this.ipk = ipk;
}

public abstract double hitungBiayaSPP();

// Getter untuk nama
public String getNama() {
   return nama;
}

// Getter untuk nim
public String getNim() {
   return nim;
}

// Getter untuk ipk
public double getIpk() {
   return ipk;
}
}