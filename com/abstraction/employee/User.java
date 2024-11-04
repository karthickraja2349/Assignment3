package employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter details of employees:");

        while (true) {
            System.out.print("Enter employee type (1 for Hourly, 2 for Salaried, 0 to stop): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            if (type == 0) {
                break;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee ID: ");
            String employeeId = scanner.nextLine();

            if (type == 1) {
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();

                System.out.print("Enter hours worked: ");
                double hoursWorked = scanner.nextDouble();
                employees.add(new HourlyEmployee(name, employeeId, hourlyRate, hoursWorked));
            } else if (type == 2) {
                System.out.print("Enter annual salary: ");
                double annualSalary = scanner.nextDouble();
                employees.add(new SalariedEmployee(name, employeeId, annualSalary));
            } else {
                System.out.println("Invalid employee type. Please try again.");
            }

            scanner.nextLine();
        }

        System.out.println("\nEmployee Details and Pay:");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeDetails());
            System.out.printf("Monthly Pay: %.2f%n", employee.calculatePay());
            System.out.println();
        }

        scanner.close();
    }
}

