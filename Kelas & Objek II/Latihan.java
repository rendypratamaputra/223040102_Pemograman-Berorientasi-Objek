package KelasObjekII;

public class Latihan {
    public static void main(String[] args) {
        // Membuat objek Student x
        Student x = new Student();
        
        // Menyamakan referensi y dengan x
        Student y = x;
        
        // Mengatur NRP objek x dan y
        x.setNrp("01");
        y.setNrp("02");
        
        // Mencetak NRP objek x
        System.out.println(x.getNrp());
        
        // Membuat objek Student z
        Student z = new Student();
        
        // Mengatur NRP objek z
        z.setNrp("03");
        
        // Menyamakan x dengan z
        x = z;
        
        // Mencetak NRP objek x setelah diubah
        System.out.println(x.getNrp());
        
        // Mencetak NRP objek y
        System.out.println(y.getNrp());
    }
}
