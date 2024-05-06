package Tugas_Pbo_Perusahaan;

public class Karyawan {
	    protected String nama;
	    protected String alamat;
	    protected double gaji;

	    // Constructor
	    public Karyawan(String nama, String alamat, double gaji) {
	        this.nama = nama;
	        this.alamat = alamat;
	        this.gaji = gaji;
	    }

	    // Getter dan setter
	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public String getAlamat() {
	        return alamat;
	    }

	    public void setAlamat(String alamat) {
	        this.alamat = alamat;
	    }

	    public double getGaji() {
	        return gaji;
	    }

	    public void setGaji(double gaji) {
	        this.gaji = gaji;
	    }

	   
	}


