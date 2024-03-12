package KelasObjekSesi4;

public class MataKuliah {
	// Atribut untuk menyimpan kode,nama,index,sks mata kuliah
	    private String kode;
	    private String nama;
	    private String index;
	    private int sks;

	 // Konstruktor untuk menginisialisasi atribut-atribut kelas
	    public MataKuliah(String kode, String nama, String index, int sks) {
	        this.kode = kode;
	        this.nama = nama;
	        this.index = index;
	        this.sks = sks;
	    }
	    
	 // Getter untuk mendapatkan jumlah SKS mata kuliah
	    public int getSks() {
	        return sks;
	    }
	 // Metode untuk menghitung nilai indeks dari mata kuliah
	    public double nilaiIndex() {
	        switch (index) {
	            case "A":
	                return 4.0;
	            case "AB":
	                return 3.5;
	            case "B":
	                return 3.0;
	            case "BC":
	                return 2.5;
	            case "C":
	                return 2.0;
	            case "D":
	                return 1.0;
	            default:
	                return 0.0;
	        }
	    }

	 // Metode untuk menampilkan informasi tentang mata kuliah
	    public String display() {
	        return kode + " - " + nama + " - " + index;
	    }
	}


