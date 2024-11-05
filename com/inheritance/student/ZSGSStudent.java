package student;
public class ZSGSStudent extends Student {
    private String program;
    
    public ZSGSStudent(){
    
    }

    public ZSGSStudent(String name) {
        super(name);
    }

    public ZSGSStudent(String name, int age) {
        super(name, age);
    }

    public ZSGSStudent(String name, int age, String studentId, String program) {
        super(name, age, studentId);
        this.program = program;
    }

    
    public void displayInfo() {
        super.displayInfo();
        if (program != null) {
            System.out.println("Program: " + program);
        }
    }
}
