package Tugas_Pbo_Perusahaan;

public class Manager extends Karyawan {
    private String departemen;

    // Constructor
    public Manager(String nama, String alamat, double gaji, String departemen) {
        super(nama, alamat, gaji);
        this.departemen = departemen;
    }

    // Getter dan setter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

}
