package Pengayaan.Interface;

public class Main {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Algoritma Pemrograman", "Rendy", 2020);
        Buku buku2 = new Buku("Sistem Jaringan Komputer", "Rihana", 2019);

        Anggota anggota1 = new Anggota("Rendy", "A001");
        Anggota anggota2 = new Anggota("Rihana", "A002");

        Perpustakaan perpustakaan = new Perpustakaan();

        // Peminjaman buku1 oleh anggota 1
        perpustakaan.pinjamBuku(buku1, anggota1);

        // Peminjaman buku2 oleh anggota 2
        perpustakaan.pinjamBuku(buku2, anggota2);

        // Peminjaman buku2 oleh anggota 1 (gagal karena sedang dipinjam oleh anggota 2)
        perpustakaan.pinjamBuku(buku2, anggota1);

        // Pengembalian buku1 oleh anggota 1
        perpustakaan.kembalikanBuku(buku1, anggota1);

        // Pengembalian buku1 oleh anggota 1 (gagal karena buku tidak sedang dipinjam oleh anggota 1)
        perpustakaan.kembalikanBuku(buku1, anggota1);

    }
}
