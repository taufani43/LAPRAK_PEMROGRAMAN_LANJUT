package BAB_6;

import java.util.ArrayList;

class DataMahasiswa {
    private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private static Mahasiswa mahasiswa1 = new Mahasiswa();

    public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa msw){
        mhs.add(msw);
        return mhs;
    }

    public static void tampilSemuaData(){
        // Gunakan perulangan
        for (Mahasiswa mahasiswa1 : mhs) {
            System.out.println("========= Tampilan Data Mahasiswa " + (mhs.indexOf(mahasiswa1) + 1) + " Filkom UB =========");
            System.out.println("Nama Mahasiswa \t: " + mahasiswa1.getNama());
            System.out.println("Jurusan \t: " + mahasiswa1.getJurusan());
            System.out.println("Status \t\t: " + (mahasiswa1.getStatus() ? "Menikah" : "Lajang"));
            System.out.println();
        }
    }

    public static Mahasiswa cariMahasiswa(String nama){
        // Gunakan perulangan
        for (Mahasiswa mahasiswa : mhs) {
            if (mahasiswa.getNama().equals(nama)) {
                System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
                return mahasiswa1;
            } 
        }

        System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan");
        return null;
    }

    public static void tampilMahasiswa(Mahasiswa mahasiswa){
        System.out.println("Nama Mahasiswa \t: " + mahasiswa.getNama());
        System.out.println("Jurusan \t: " + mahasiswa.getJurusan());
        System.out.println("Status \t\t: " + (mahasiswa.getStatus() ? "Menikah" : "Lajang"));
        System.out.println();
    }

    public static void updateMahasiswa(Mahasiswa msw1, Mahasiswa msw2){
        msw1.setNama(msw2.getNama());
        msw1.setJurusan(msw2.getJurusan());
        msw1.setStatus(msw2.getStatus());
    }
}