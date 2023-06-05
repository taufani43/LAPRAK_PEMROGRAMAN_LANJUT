package BAB_5;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String NIK;
    private boolean menikah;
    
    public Manusia(String nama, boolean jenisKelamin, String NIK, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.NIK = NIK;
        this.menikah = menikah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean JenisKelamin() {
        return jenisKelamin;
    }
    
    public String getNIK() {
        return NIK;
    }

    public boolean Menikah() {
        return menikah;
    }
    
    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }
    
    public double getPendapatan() {
        return getTunjangan();
    }
    
    public String toString() {
        String jenis = "Perempuan";
        if (jenisKelamin) {
            jenis = "Laki-laki";
        }
        return "Nama \t\t: " + nama + "\nNIK \t\t: " + NIK + "\nJenis Kelamin \t: " + jenis + "\nPendapatan \t: $" + getPendapatan();
    }
}