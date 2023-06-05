package BAB_3;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Perpus {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak;
    private String sinopsis;
    private int jumlah_Kata;
    private double tingkatKesamaan;
    private int HargaBuku;
    private int persentaseRoyalti;
    private int Royalti;
    private int jualBuku;

    public Perpus() {
    }

    public Perpus(String nKategori, String nPenulis, String nJudul, String nBahasa, String nPenerbitan, String nEdisi, String nHalaman, String nSinopsis) {
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    public void setSinopsis(String s) {
        sinopsis = s;
        hitungJumlahKata();
    }

    public void setHargaBuku(int i) {
        HargaBuku = i;
    }

    public void setJualBuku(int i) {
        jualBuku = i;
    }

    public void setPersentaseRoyalti(int i) {
        persentaseRoyalti = i;
    }

    public void setRoyalti(int i) {
        Royalti = i;
    }

    public void hitungJumlahKata() {
        String kata = sinopsis;
        int hitung = 0;

        for (int x = 0; x < kata.length(); x++) {
            if (kata.charAt(x) == ' ') {
                hitung++;
            }
        }

        if (hitung > 0) {
            hitung = hitung + 1; 
        }

        jumlah_Kata = hitung;
    }

    public double cekTingkatKesamaan(Perpus p) {
        double jumlahKesamaan = 0;
        double jumlahAtribut = 8;

        if (this.kategori.equals(p.kategori)) {
            jumlahKesamaan++;
        }
        if (this.penulis.equals(p.penulis)) {
            jumlahKesamaan++;
        }
        if (this.judul.equals(p.judul)) {
            jumlahKesamaan++;
        }
        if (this.penerbitan.equals(p.penerbitan)) {
            jumlahKesamaan++;
        }
        if (this.edisi.equals(p.edisi)) {
            jumlahKesamaan++;
        }
        if (this.halaman == p.halaman) {
            jumlahKesamaan++;
        }
        if (this.bahasa.equals(p.bahasa)) {
            jumlahKesamaan++;
        }
        if (this.sinopsis != null && this.sinopsis.equals(p.sinopsis)) {
            jumlahKesamaan++;
        }
        
        tingkatKesamaan = jumlahKesamaan/jumlahAtribut * 100;
        displayPersentaseTingkatKesamaan(p);
        return tingkatKesamaan;
    }

    public int hitungRoyalti(int hargaBuku) {
        this.HargaBuku = hargaBuku;
        Royalti = (jualBuku * HargaBuku * 10) / 100;
        return Royalti;
    }

    public int hitungRoyalti(int hargaBuku, int persenRoyalti) {
        this.HargaBuku = hargaBuku;
        this.persentaseRoyalti = persenRoyalti;
        Royalti = (jualBuku * HargaBuku * persentaseRoyalti) / 100;
        return Royalti;
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if (jumlah_Kata >= 10) {
            System.out.println("Sinopsis : " + sinopsis);
        }
        System.out.println("Jumlah kata pada sinopsis : " + jumlah_Kata);
        System.out.println("Penjualan buku bulan ini : " + jualBuku);
        System.out.println("Royalti : " + Royalti);
    }

    public void displayPersentaseTingkatKesamaan(Perpus p) {
        System.out.println("Tingkat kesamaan dari buku yang berbeda : " + tingkatKesamaan + "%");
    }

    public void bacaFile(String pathFile) {
        try {
            File file = new File(pathFile);
            Scanner io = new Scanner(file);
            String isiFile = io.nextLine();

            String[] isi = isiFile.split("; ");
            
            this.judul = isi[0];
            this.penulis = isi[1];

            io.close();
        } 
        
        catch(FileNotFoundException except) {
            System.out.println("File tidak ditemukan: " + except.getMessage());
        }
    }

    public void simpanFile(String namaFile) {
        try{
            FileWriter nama = new FileWriter(namaFile);
            BufferedWriter ketik = new BufferedWriter(nama);
            ketik.write(judul + "; " + penulis);
            ketik.close();
        }

        catch (IOException except) {
            System.out.println("Error : " + except.getMessage());
        }
    }
}