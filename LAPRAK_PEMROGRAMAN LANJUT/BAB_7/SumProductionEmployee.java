package BAB_7;
public class SumProductionEmployee extends Employee {
    private double upahPerBarang;
    private int jumlahBarang;

    public SumProductionEmployee(String name, String noKTP, int year, int month, int date, double upahPerBarang, int jumlahBarang) {
        super(name, noKTP, year, month, date);
        setUpahPerBarang(upahPerBarang);
        setJumlahBarang(jumlahBarang);
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public double earnings() {
        return super.earnings() + getUpahPerBarang() * getJumlahBarang();
    }

    public String toString() {
        return String.format("Production employee: " + super.toString() + "\nUpah per barang: " + getUpahPerBarang() + "\nJumlah barang/minggu: " + getJumlahBarang());
    }
}
