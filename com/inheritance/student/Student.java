package student;
public abstract class Student {
    private String name;
    private int age;
    private String studentId;
    
    public Student(){
    
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        if (age > 0) {
            System.out.println("Age: " + age);
        }
        if (studentId != null) {
            System.out.println("Student ID: " + studentId);
        }
    }
}




