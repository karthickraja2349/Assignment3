package employee;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n");
        sb.append(String.format("| %-20s : %-25d|\n", "ID", getId()));
        sb.append(String.format("| %-20s : %-25s|\n", "Name", getName()));
        sb.append("--------------------------------------------------------\n");
        return sb.toString();
    }
}

