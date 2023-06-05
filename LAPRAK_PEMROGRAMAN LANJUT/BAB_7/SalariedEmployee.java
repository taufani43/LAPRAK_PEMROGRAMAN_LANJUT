package BAB_7;
public class SalariedEmployee extends Employee {
    private double monthSalary;

    public SalariedEmployee(String name, String noKTP, int year, int month, int date, double salary) {
        super(name, noKTP, year, month, date);
        setMonthSalary(salary);
    }

    public void setMonthSalary(double salary) {
        monthSalary = salary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public double earnings() {
        return super.earnings() + getMonthSalary();
    }
    public String toString() {
        return String.format("Salaried employee:" + super.toString() + "\nMonth salary: " + getMonthSalary());
    }
}

