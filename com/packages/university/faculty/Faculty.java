package university.faculty;

public class Faculty {
    private String name;
    private int facultyId;
    private String department;

    public Faculty(String name, int facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getDepartment() {
        return department;
    }


    public String toString() {
        return "Faculty [Name=" + name + ", ID=" + facultyId + ", Department=" + department + "]";
    }
}

