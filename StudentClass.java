public class StudentClass {
    // Declare a static variable id having data type int and assign it the value 20.
    static int id = 20;

    public static void main(String[] args) {
        // Create an object of the class Student.
        StudentClass s = new StudentClass();
        // Call static variable using object reference variable s and store it by variable x with data type int.
        int x = s.id;
        // Print on the console.
        System.out.println(x); //prints 20
        // Now Call static variable id using the class name.
        System.out.println(StudentClass.id); //prints 20
    }
}
