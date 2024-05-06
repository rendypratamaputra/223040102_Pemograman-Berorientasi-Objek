package Pbo_Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1001", "Ade Sukendar", "Bandung");
        System.out.println(mhs.getNama() + "_" + mhs.getNrp() + "_" + mhs.getAlamat());
    }
}
