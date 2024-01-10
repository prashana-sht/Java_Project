package pkg1.pkg4.classdiagram;
public class Staff {
    protected String code;
    protected String name;

    // Constructor
    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Methods
    public void displayDetails() {
        System.out.println("Code: " + code);        
        System.out.println("Name: " + name);
    }
}
