package Pengayaan.Interface;

public class Perpustakaan implements Peminjaman {
    @Override
    public void pinjamBuku(Buku buku, Anggota anggota) {
        anggota.pinjamBuku(buku);
    }
  
    @Override
    public void kembalikanBuku(Buku buku, Anggota anggota) {
        anggota.kembalikanBuku(buku);
    }
}