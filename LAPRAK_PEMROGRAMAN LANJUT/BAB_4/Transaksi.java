package BAB_4;

public class Transaksi {
    private String namaPelanggan;
    private String nomorPelanggan;
    private String PIN;
    private double saldo;
    private double pembelian;
    private double cashback;
    private int kesalahan;
    private boolean autentifikasi = false;

    public Transaksi() {
    }

    public void setNamaPelanggan(String nama) {
        namaPelanggan = nama;
    }

    public void setNomorPelanggan(String nomor) {
        nomorPelanggan = nomor;
    }

    public void setPIN(String pin) {
        PIN = pin;
    }

    public void setSaldo(double s) {
        saldo = s;
    }

    public void Autentifikasi(String nomor, String pin) {
        if (nomor.equals(nomorPelanggan)) {
            if (pin.equals(PIN)) {
                System.out.println("Autentifikasi yang anda lakukan berhasil! \n");
                System.out.println("Informasi Akun");
                System.out.println("Nama Pelanggan \t: " + namaPelanggan);
                System.out.println("Nomor Pelanggan : " + nomorPelanggan);
                System.out.println("Informasi saldo : " + saldo);
                autentifikasi = true;
            } else {
                System.out.println("PIN yang anda masukkan salah. Silahkan masukkan ulang!");
                kesalahan++;
            }
        } else {
            System.out.println("Nomor pelanggan tidak terdeteksi. Silahkan masukkan ulang!");
            kesalahan++;
        }

        if (kesalahan >= 3) {
            System.out.println("\nBatas autentifikasi telah terlampaui!");
        }
            
    }
    
    public void TopUp(double t) {
        if (kesalahan == 3) {
            System.out.println("Mohon maaf akun anda telah diblokir!");
            System.out.println("===========================================================");
        } else if(autentifikasi == false) {
        } else {
            saldo += t;
            System.out.println("Top up yang anda lakukan berhasil!");
            System.out.println("Saldo anda saat ini: " + saldo);
            System.out.println("===========================================================");
        }
    }
    
    public void Pembelian(double p) {
        if (kesalahan == 3) {
            System.out.println("Mohon maaf akun anda telah diblokir!");
        } else if(autentifikasi == false) {
        } else {
            pembelian = p;
            hitungPembelian(pembelian);
        }
    }

    private double hitungCashback(double p) {
        pembelian = p;
        String jenisRekening = nomorPelanggan.substring(0, 2);
        if (pembelian > 1000000) {
            switch (jenisRekening) {
                case "38":
                    cashback = pembelian * 0.05;
                    saldo += cashback;
                    System.out.println("Transaksi pembelian berhasil!");
                    System.out.println("Cashback yang didapatkan: " + cashback);
                    System.out.println("Saldo anda saat ini   \t: " + saldo);
                    break;
                case "56":
                    cashback = pembelian * 0.07;
                    saldo += cashback;
                    System.out.println("Transaksi pembelian berhasil!");
                    System.out.println("Cashback yang didapatkan: " + cashback);
                    System.out.println("Saldo anda saat ini   \t: " + saldo);
                    break;
                case "74":
                    cashback = pembelian * 0.10;
                    saldo += cashback;
                    System.out.println("Transaksi pembelian berhasil!");
                    System.out.println("Cashback yang didapatkan: " + cashback);
                    System.out.println("Saldo anda saat ini   \t: " + saldo);
                    break;
            }
        } else {
            switch (jenisRekening) {
                case "56":
                    cashback = pembelian * 0.02;
                    saldo += cashback;
                    System.out.println("Transaksi pembelian berhasil!");
                    System.out.println("Cashback yang didapatkan: " + cashback);
                    System.out.println("Saldo anda saat ini   \t: " + saldo);
                    break;
                case "74":
                    cashback = pembelian * 0.05;
                    saldo += cashback;
                    System.out.println("Transaksi pembelian berhasil!");
                    System.out.println("Cashback yang didapatkan: " + cashback);
                    System.out.println("Saldo anda saat ini   \t: " + saldo);
                    break;
            }
        }
        return cashback;
    }

    private void hitungPembelian(double beli) {
        double sisaSaldo = saldo - beli;
        if (sisaSaldo < 10000) {
            System.out.println("Transaksi pembelian gagal!");
            System.out.println("Saldo anda saat ini: " + sisaSaldo);
        } else {
            saldo = sisaSaldo;
            hitungCashback(pembelian);
        }
    }
}