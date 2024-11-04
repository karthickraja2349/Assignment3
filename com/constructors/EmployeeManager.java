package com.constructors;
import com.ClassesAndObjects.EmployeeDTO;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    
    private List<EmployeeDTO> employees;

  
    public EmployeeManager() {
        employees = new ArrayList<>();
    }


    public void addEmployee(int id, String name, String position, String department, double salary, 
                            String socialSecurityNumber, String phoneNumber, String email) {
        EmployeeDTO employee = new EmployeeDTO(id, name, position, department, salary, 
                                               socialSecurityNumber, phoneNumber, email);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    
    public void displayEmployees() {
        System.out.println("\nEmployee List:");
        for (EmployeeDTO employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("\nTotal employees added: " + EmployeeDTO.getEmployeeCount());
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(1, "Alice Johnson", "Software Engineer", "IT", 70000, 
                            "123-45-6789", "123-456-7890", "alice@example.com");
        manager.addEmployee(2, "Bob Smith", "Data Analyst", "Data", 65000, 
                            "987-65-4321", "098-765-4321", "bob@example.com");
        manager.addEmployee(3, "Charlie Brown", "Project Manager", "Management", 85000, 
                            "456-78-9012", "456-789-0123", "charlie@example.com");

    
        manager.displayEmployees();
    }
}

