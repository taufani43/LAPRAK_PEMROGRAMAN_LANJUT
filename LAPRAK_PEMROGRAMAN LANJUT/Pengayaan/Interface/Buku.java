package Pengayaan.Interface;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;
  
    // constructor, getter, setter, dan method lainnya
    public Buku(String judul, String penulis, int tahunTerbit) {
      this.judul = judul;
      this.penulis = penulis;
      this.tahunTerbit = tahunTerbit;
      this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
      return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
}
