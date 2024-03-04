package KelasObjekII;

public class ReferensiObjekNULL {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);
        
        // Menampilkan jari-jari l1, l2, dan l3
        System.out.println("Jari-jari l1: " + l1.getJari2());
        System.out.println("Jari-jari l2: " + l2.getJari2());
        System.out.println("Jari-jari l3: " + l3.getJari2());
        
        // Mengubah referensi l2 untuk menunjuk ke objek l3
        l2 = null;
        
        // Menampilkan jari-jari l1, l2, dan l3 setelah perubahan referensi l2
        System.out.println("Jari-jari l1 setelah perubahan: " + l1.getJari2());
        
        // Mencoba mengakses properti objek melalui variabel referensi yang bernilai null
        // Akan terjadi error NullPointerException
        // System.out.println("Jari-jari l2 setelah perubahan: " + l2.getJari2());
        
        // Menampilkan jari-jari l3 setelah perubahan referensi l2
        System.out.println("Jari-jari l3 setelah perubahan: " + l3.getJari2());
    }
}
