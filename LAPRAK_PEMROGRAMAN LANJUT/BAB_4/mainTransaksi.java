package BAB_4;

public class mainTransaksi {
    public static void main(String[] args) {
        System.out.println("===========================================================");
        System.out.println("                      Pelanggan 1");
        System.out.println("===========================================================");
        Transaksi c1 = new Transaksi();
        c1.setNamaPelanggan("Wahyudi");
        c1.setNomorPelanggan("7478123452");
        c1.setPIN("gemuk1234");
        c1.setSaldo(1000000);
        c1.Autentifikasi("7478123452", "gemuk1234");
        System.out.println("===========================================================");
        c1.TopUp(500000);
        c1.Pembelian(1200000);

        System.out.println("===========================================================");
        System.out.println("                      Pelanggan 2");
        System.out.println("===========================================================");
        Transaksi c2 = new Transaksi();
        c2.setNamaPelanggan("Mulyadi");
        c2.setNomorPelanggan("5642957821");
        c2.setPIN("bobokaja");
        c2.setSaldo(2000000);
        c2.Autentifikasi("5642957821", "tiduraja");
        c2.Autentifikasi("5642957821", "tiduraja");
        c2.Autentifikasi("5642957821", "tiduraja");
        System.out.println("===========================================================");
        c2.TopUp(100000);
        c2.Pembelian(800000);

        System.out.println("===========================================================");
        System.out.println("                      Pelanggan 3");
        System.out.println("===========================================================");
        Transaksi c3 = new Transaksi();
        c3.setNamaPelanggan("Setyaningsih");
        c3.setNomorPelanggan("3842957821");
        c3.setPIN("mimin345");
        c3.setSaldo(3000000);
        c3.Autentifikasi("3842957821", "mimin345");
        System.out.println("===========================================================");
        c3.TopUp(3000000);
        c3.Pembelian(5700000);

        System.out.println("===========================================================");
        System.out.println("                      Pelanggan 4");
        System.out.println("===========================================================");
        Transaksi c4 = new Transaksi();
        c4.setNamaPelanggan("Wilda");
        c4.setNomorPelanggan("3854821023");
        c4.setPIN("siniyuk");
        c4.setSaldo(10000);
        c4.Autentifikasi("7442957821", "siniyuk");
        c4.Autentifikasi("7442957821", "siniyuk");
        c4.Autentifikasi("3854821023", "siniyuk");
        System.out.println("===========================================================");
        c4.TopUp(2000);
        c4.Pembelian(8000);

        System.out.println("===========================================================");
        System.out.println("                      Pelanggan 5");
        System.out.println("===========================================================");
        Transaksi c5 = new Transaksi();
        c5.setNamaPelanggan("Suryadi");
        c5.setNomorPelanggan("5623895410");
        c5.setPIN("bapakgue1");
        c5.setSaldo(1000000);
        c5.Autentifikasi("5623895410", "bundague1");
        c5.Autentifikasi("5623895410", "bapakgue1");
        System.out.println("===========================================================");
        c5.TopUp(2000000);
        c5.Pembelian(900000);
        System.out.println("===========================================================");
    }
}
