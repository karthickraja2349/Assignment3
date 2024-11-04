package employee;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
          .append(String.format("| %-20s : %-25.2f|\n", "Hourly Rate", hourlyRate))
          .append(String.format("| %-20s : %-25d|\n", "Hours Worked", hoursWorked));
        return sb.toString();
    }

    //overload
    public String toString(boolean includeHours) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("| %-20s : %-25.2f|\n", "Hourly Rate", hourlyRate));
        sb.append("--------------------------------------------------------\n");
        if (includeHours) {
            sb.append(String.format("| %-20s : %-25d|\n", "Hours Worked", hoursWorked));
            sb.append("--------------------------------------------------------\n");
        }
        return sb.toString();
    }
}

