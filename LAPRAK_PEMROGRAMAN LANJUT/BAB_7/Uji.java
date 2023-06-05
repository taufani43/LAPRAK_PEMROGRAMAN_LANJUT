package BAB_7;

public class Uji {
        public static void main(String[] args) { 
        SalariedEmployee salariedEmployee = new SalariedEmployee("Tina", "135", 2003, 5, 12, 50000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Siska", "234", 2000, 3, 1, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Kiki", "145", 2002, 1, 22, 1000, .05);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 1993, 8, 17, 5000, .07,800);
        
        SumProductionEmployee emp1 = new SumProductionEmployee("Santi", "213", 2005, 4, 21, 5000, 60);
        SumProductionEmployee emp2 = new SumProductionEmployee("Bagas", "348", 2003, 9, 1, 3000, 40);
        SumProductionEmployee emp3 = new SumProductionEmployee("Winda", "785", 2000, 12, 3, 3500, 80);
        SumProductionEmployee emp4 = new SumProductionEmployee("Retno", "420", 1995, 7, 14, 20000, 10);

        Employee[] employees = new Employee[8];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = emp1;
        employees[5] = emp2;
        employees[6] = emp3;
        employees[7] = emp4;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee; employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% :$%,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
