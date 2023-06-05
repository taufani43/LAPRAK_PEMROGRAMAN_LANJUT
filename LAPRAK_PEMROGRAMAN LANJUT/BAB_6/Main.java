package BAB_6;

public class Main {
    public static void main(String[] args) {
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

        // Lakukan modifikasi data tambah mahasiswa ...
        Mahasiswa mahasiswa3 = new Mahasiswa("Rayhan Priambodo", "Teknik Informatika", false);
        DataMahasiswa.tambahMahasiswa(mahasiswa3);
        Mahasiswa mahasiswa4 = new Mahasiswa("Budi Rahayu", "Teknik Komputer", true);
        DataMahasiswa.tambahMahasiswa(mahasiswa4);
        Mahasiswa mahasiswa5 = new Mahasiswa("Agus Sutomo", "Sistem Informasi", false);
        DataMahasiswa.tambahMahasiswa(mahasiswa5);
        
        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();

        // Method cariMahasiswa (jika data ada)
        System.out.println("============== Pencarian Data Mahasiswa ==============");
        DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
        DataMahasiswa.cariMahasiswa("Budi Rahayu");
        DataMahasiswa.cariMahasiswa("Denar Abidin");
        System.out.println();
        
        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Andi Irawan");
        DataMahasiswa.cariMahasiswa("Mahfud Demian");
        DataMahasiswa.cariMahasiswa("Tri Romadoni");
        System.out.println();

        // Method tampilMahasiswa (sebelum diupdate)
        System.out.println("======= Tampilan Data Mahasiswa Sebelum Update =======");
        DataMahasiswa.tampilMahasiswa(mahasiswa3);

        // Method tampilMahasiswa (setelah diupdate)
        System.out.println("======= Tampilan Data Mahasiswa Setelah Update =======");
        Mahasiswa mahasiswa6 = new Mahasiswa("Rayhan Sitepu", "Magister Ilmu Komputer", true);
        DataMahasiswa.updateMahasiswa(mahasiswa3, mahasiswa6);
        DataMahasiswa.tampilMahasiswa(mahasiswa3);
    }
}