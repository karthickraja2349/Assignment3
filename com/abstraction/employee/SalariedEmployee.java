package employee;
public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, String employeeId, double annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }
}
