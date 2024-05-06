package Tugas_Pbo_Perusahaan;

public class Main {

	    public static void main(String[] args) {
	        Manager manager = new Manager("Supratman", "", 3500000, "Pemasaran");
	        Staf staf = new Staf("Junaedi", "Cimahi", 2500000, "Keuangan");

	        System.out.println("Manager:");
	        System.out.println("Nama: " + manager.getNama());
	        System.out.println("Alamat: " + manager.getAlamat());
	        System.out.println("Gaji: " + manager.getGaji());
	        System.out.println("Departemen: " + manager.getDepartemen());

	        System.out.println("\nStaff:");
	        System.out.println("Nama: " + staf.getNama());
	        System.out.println("Alamat: " + staf.getAlamat());
	        System.out.println("Gaji: " + staf.getGaji());
	        System.out.println("Divisi: " + staf.getDivisi());
	    }
	}


