package BAB_7;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String noKTP, int year, int month, int date, double sales, double rate){
        super(name, noKTP, year, month, date);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales){
        grossSales = sales;
    }
    
    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double rate){
        commissionRate = rate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return super.earnings() + getCommissionRate() * getGrossSales();
    }

    public String toString(){
        return String.format("Commision employee:"+super.toString()+"\ngross sales:"+getGrossSales()+"\ncommission rate"+getCommissionRate());
    }
}
