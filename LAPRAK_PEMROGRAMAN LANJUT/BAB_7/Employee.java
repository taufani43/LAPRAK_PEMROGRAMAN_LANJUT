package BAB_7;
import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee(String name, String noKTP, int year, int month, int date){
        this.name = name;
        this.noKTP = noKTP;
        tanggalLahir = LocalDate.of(year, month, date);
    }

    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public double bonusUltah() {
        return 100000;
    }

    // Acessor untuk atribut tanggal lahir
    public LocalDate getTanggalLahir() { 
        return tanggalLahir;
    }

    // Mutator untuk atribut tanggal lahir
    public void setTanggalLahir(LocalDate tanggalLahir) { 
        this.tanggalLahir = tanggalLahir;
    }

    public String toString(){
        if (tanggalLahir.getMonthValue() == LocalDate.now().getMonthValue()){
            return String.format(" "+ getName() +"\nNo. KTP : " + getNoKTP() + "\nTanggal lahir : " + getTanggalLahir() + "\nBonus ultah : " + bonusUltah());
        } else {
            return String.format(" "+ getName() +"\nNo. KTP : " + getNoKTP() + "\nTanggal lahir : " + getTanggalLahir());
        }
    }

    public double earnings(){
        if (tanggalLahir.getMonthValue() == LocalDate.now().getMonthValue()){
            return bonusUltah();
        } else {
            return 0;
        }
    }
}

