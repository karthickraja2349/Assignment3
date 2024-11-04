package employee;
public abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculatePay();
    
    public String getEmployeeDetails() {
        return String.format("Employee ID: %s, Name: %s", employeeId, name);
    }
}
