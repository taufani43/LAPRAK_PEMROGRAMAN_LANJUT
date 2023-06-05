package BAB_5;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String NIK, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, NIK, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        double bonus = 0.0;
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            bonus = 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            bonus = 0.1 * gaji;
        } else if (lamaBekerja > 10) {
            bonus = 0.15 * gaji;
        }
        return bonus;
    }

    public double getPendapatan() {
        double pendapatan = gaji + getBonus() + getTunjangan();
        if (jumlahAnak > 0) {
            pendapatan += (20 * jumlahAnak);
        }
        return pendapatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTahun masuk \t: " + tahunMasuk + "\nJumlah anak \t: " + jumlahAnak + "\nGaji \t\t: $" + gaji;
    }
}