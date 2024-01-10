package pkg1.pkg4.classdiagram;
public class Officer extends Staff{
    private String grade;

    // Constructor
    public Officer(String code, String name, String grade){
        super(code, name);        
        this.grade = grade;
        
    }

    public void manageDepartment() {
        System.out.println(name + " manages " + grade + " grade.");
    }
}
