package person;
public class User {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 25, "123 Main St");

        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}
