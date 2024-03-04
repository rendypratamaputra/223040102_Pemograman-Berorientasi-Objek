package KelasObjekII;

public class LingkaranMain {

    public static void main(String[] args) {
        // Membuat objek Lingkaran l1 dengan jari-jari 5
        Lingkaran l1 = new Lingkaran(5);
        
        // Menggunakan l2 untuk merujuk ke objek yang sama dengan l1
        Lingkaran l2 = l1;
        
        // Menampilkan jari-jari l1 dan l2 sebelum diubah
        System.out.println("Jari-jari l1 awal: " + l1.getJari2());
        System.out.println("Jari-jari l2 awal: " + l2.getJari2());
        
        // Mengubah jari-jari l2 dengan memanggil method ubahJari2
        ubahJari2(l2);
        
        // Menampilkan jari-jari l1 dan l2 setelah diubah
        System.out.println("Jari-jari l1 setelah diubah: " + l1.getJari2());
        System.out.println("Jari-jari l2 setelah diubah: " + l2.getJari2());       
    }

    // Method untuk mengubah jari-jari Lingkaran
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    } 
}

