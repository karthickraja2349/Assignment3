package employee;

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new HourlyEmployee("Tamil", 101, 15.50, 40);
        employees[1] = new SalariedEmployee("Ravi", 102, 60000);
        employees[2] = new HourlyEmployee("Mani", 103, 20.00, 30);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        HourlyEmployee hourlyEmp = (HourlyEmployee) employees[0];
        System.out.println(hourlyEmp.toString(false)); // Without hours
    }
}

