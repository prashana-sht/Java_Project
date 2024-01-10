package pkg1.pkg4.classdiagram;
public class Teacher extends Staff{
    private String subject;
    private String publication;
    // Constructor
    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
