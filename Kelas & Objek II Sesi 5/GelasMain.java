package KelasObjekSesi4;

public class GelasMain {

    public static void main(String[] args) {
     // Membuat dua objek Gelas dengan warna yang berbeda

        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");
     
     // Memanggil fungsi untuk menukar warna gelas
        tukarWarnaGelas(g1, g2);
     
     // Menampilkan warna gelas setelah pertukaran
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());
    }
 
    // Fungsi untuk menukar warna dua gelas
    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
    	
    // Membuat objek sementara untuk menyimpan warna sementara
        Gelas gTemp = new Gelas("Temp");
        
     // Menukar warna antara dua gelas menggunakan objek sementara
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());
    }
}
