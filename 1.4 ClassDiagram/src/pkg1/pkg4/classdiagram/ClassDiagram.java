package pkg1.pkg4.classdiagram;

public class ClassDiagram {

    public static void main(String[] args) {
       Teacher mathTeacher = new Teacher("123", "Ram Shrestha", "Maths", "Asmita");
        Officer off = new Officer("456", "Suraj", "12");

        System.out.println("Details of Math Teacher:");
        mathTeacher.displayDetails();
        mathTeacher.teach();

        System.out.println("\nDetails of Admin Officer:");
        off.displayDetails();
        off.manageDepartment();
    }
}
