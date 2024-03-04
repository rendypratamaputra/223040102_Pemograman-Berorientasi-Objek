package KelasObjekII;

// Mendefinisikan kelas Tugas
public class ReferensiObjek1Variabel {
    
    public static void main(String[] args) {
        // Membuat objek lingkaran l1 dengan jari-jari 5
        Lingkaran l1 = new Lingkaran(5);
        
        // Menginisialisasi objek lingkaran l2 dengan l1
        Lingkaran l2 = l1;
        
        // Menampilkan jari-jari l1
        System.out.println("Jari-jari l1: " + l1.getJari2());
        
        // Menampilkan jari-jari l2
        System.out.println("Jari-jari l2: " + l2.getJari2());
        
        // Mengubah jari-jari l2 menjadi 10
        l2.setJari2(10);
        
        // Menampilkan jari-jari l1 setelah diubah oleh l2
        System.out.println("Jari-jari l1 setelah diubah: " + l1.getJari2());
        
        // Menampilkan jari-jari l2 setelah diubah
        System.out.println("Jari-jari l2 setelah diubah: " + l2.getJari2());
    }
}
