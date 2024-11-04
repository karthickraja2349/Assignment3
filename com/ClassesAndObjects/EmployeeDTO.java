package com.ClassesAndObjects;
public class EmployeeDTO {

    private static int employeeCount = 0;

    private int id;
    private String name;
    private String position;
    private String department;
    private double salary;

    // PII (Persoally Identifiable Information)
    private String socialSecurityNumber;
    private String phoneNumber;
    private String email;

    public EmployeeDTO(int id, String name, String position, String department, double salary, 
                       String socialSecurityNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Controlled access to PII
    public String getMaskedSocialSecurityNumber() {
        return "XXX-XX-" + socialSecurityNumber.substring(socialSecurityNumber.length() - 4);
    }

    public String getMaskedPhoneNumber() {
        return "XXX-XXX-" + phoneNumber.substring(phoneNumber.length() - 4);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25d|\n", "ID", getId()))
          .append(String.format("| %-20s : %-25s|\n", "Name", getName()))
          .append(String.format("| %-20s : %-25s|\n", "Position", getPosition()))
          .append(String.format("| %-20s : %-25s|\n", "Department", getDepartment()))
          .append(String.format("| %-20s : %-25.2f|\n", "Salary", getSalary()))
          .append(String.format("| %-20s : %-25s|\n", "SSN", getMaskedSocialSecurityNumber()))
          .append(String.format("| %-20s : %-25s|\n", "Phone Number", getMaskedPhoneNumber()))
          .append(String.format("| %-20s : %-25s|\n", "Email", getEmail()))
          .append("--------------------------------------------------------");
        return sb.toString();
    }
}
