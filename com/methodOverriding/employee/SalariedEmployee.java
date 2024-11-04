package employee;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("--------------------------------------------------------\n");
        sb.append(String.format("| %-20s : %-25.2f|\n", "Annual Salary", annualSalary));
        sb.append("--------------------------------------------------------\n");
        return sb.toString();
    }
}

