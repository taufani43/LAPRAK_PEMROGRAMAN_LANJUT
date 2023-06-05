package Pengayaan.Interface;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
  private String nama;
  private String nomorAnggota;
  private List<Buku> riwayatPeminjaman;

  // constructor, getter, setter, dan method lainnya
  public Anggota(String nama, String nomorAnggota) {
    this.nama = nama;
    this.nomorAnggota = nomorAnggota;
    this.riwayatPeminjaman = new ArrayList<>();
  }

  public String getNama() {
      return nama;
  }

  public String getNomorAnggota() {
      return nomorAnggota;
  }

  public List<Buku> getRiwayatPeminjaman() {
      return riwayatPeminjaman;
  }

  public void pinjamBuku(Buku buku) {
    if (!buku.isDipinjam()) {
        buku.setDipinjam(true);
        riwayatPeminjaman.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + nama);
    } else {
        System.out.println("Buku '" + buku.getJudul() + "' sedang dipinjam oleh anggota lain.");
    }
  }

  public void kembalikanBuku(Buku buku) {
      if (riwayatPeminjaman.contains(buku)) {
          buku.setDipinjam(false);
          riwayatPeminjaman.remove(buku);
          System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan oleh " + nama);
      } else {
          System.out.println("Buku '" + buku.getJudul() + "' tidak sedang dipinjam oleh anggota tersebut.");
      }
  }
}