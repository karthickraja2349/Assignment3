package university;

import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("Tamil", 101, "Computer Science");
        Course course = new Course("Data Structures", "CS201", 4);
        Faculty faculty = new Faculty("Guna", 1001, "Computer Science");

        System.out.println(student);
        System.out.println(course);
        System.out.println(faculty);
    }
}

