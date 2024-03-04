package KelasObjekII;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 5
        Lingkaran lingkaran1 = new Lingkaran(5);

        // Membuat objek Node dengan data Lingkaran lingkaran1
        Node node1 = new Node(lingkaran1);

        // Mencetak nilai jari-jari objek Node
        System.out.println("Jari-jari objek Node : " + node1.getData().getJari2());

        // Membuat objek Persistence
        Persistence persistence = new Persistence();

        // Menyimpan objek Lingkaran yang terdapat dalam objek Node ke dalam database menggunakan Persistence
        persistence.save(node1.getData());
    }
}