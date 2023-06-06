package Hackerrank;

import java.util.*;

class Buah {
    String nama;
    int stok;

    public Buah(String nama, int stok){
        this.nama = nama;
        this.stok = stok;   
    }
    
    void jualBeli(int jumlah){
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah = " + stok);
        } else {
            System.out.println("Gagal checkout buah");
        }
    }
}

class Manusia {
    String nama;
    int jumlahBeli;

    public Manusia(String nama, int jumlahBeli){
        this.nama = nama;
        this.jumlahBeli = jumlahBeli;
    }
    
    void jualBeli(Buah jenisBuah){
        jenisBuah.jualBeli(jumlahBeli);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        String namaBuah = io.nextLine();
        int stokBuah = io.nextInt();
        int jumlahBeli = io.nextInt();

        if (stokBuah == 0 || jumlahBeli == 0) {
            System.out.println("NA");
        } else {
            Buah jenisBuah = new Buah(namaBuah, stokBuah);
            Manusia manusia = new Manusia("Ani", jumlahBeli);

            manusia.jualBeli(jenisBuah);
        }

        io.close();
    }
}
