package KelasObjekII;

public class ReferensiObjek3Variabel {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);
        
        // Menampilkan jari-jari l1, l2, dan l3
        System.out.println("Jari-jari l1: " + l1.getJari2());
        System.out.println("Jari-jari l2: " + l2.getJari2());
        System.out.println("Jari-jari l3: " + l3.getJari2());
        
        // Mengubah referensi l2 untuk menunjuk ke objek l3
        l2 = l3;
        
        // Menampilkan jari-jari l1, l2, dan l3 setelah perubahan referensi l2
        System.out.println("Jari-jari l1 setelah perubahan: " + l1.getJari2());
        System.out.println("Jari-jari l2 setelah perubahan: " + l2.getJari2());
        System.out.println("Jari-jari l3 setelah perubahan: " + l3.getJari2());
    }
}
