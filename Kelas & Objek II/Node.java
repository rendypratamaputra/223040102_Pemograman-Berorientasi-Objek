package KelasObjekII;

public class Node {
    private Lingkaran data;
    private Node next;

    // membuat objek Node dengan data awal
    public Node(Lingkaran data) {
        this.data = data;
        this.next = null;
    }

    // Getter untuk mendapatkan data objek Node
    public Lingkaran getData() {
        return data;
    }

    // Setter untuk mengatur data objek Node
    public void setData(Lingkaran data) {
        this.data = data;
    }

    // Getter untuk mendapatkan objek Node berikutnya
    public Node getNext() {
        return next;
    }

    // Setter untuk mengatur objek Node berikutnya
    public void setNext(Node next) {
        this.next = next;
    }
}


