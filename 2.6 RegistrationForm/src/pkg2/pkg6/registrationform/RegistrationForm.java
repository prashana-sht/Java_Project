package pkg2.pkg6.registrationform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class MyFrame extends JFrame
    implements ActionListener {

    private Container c;
    private JLabel title, name,dob, mno, add, email, gender;
    private JTextField fname, lname, tmno, temail;
    private JComboBox date, month, year;
    private JRadioButton male, female, other;
    private ButtonGroup gengp;
    private JTextArea tadd;
    private JButton sub;
    private JLabel res;
 
    private String dates[]
        = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr", "May", "Jun", 
            "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022", "2023","2024"};

    public MyFrame()
    {
        setTitle("Registration Form");
        setBounds(200, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Registration Form");
        title.setSize(300, 30);
        title.setLocation(200, 30);
        c.add(title);
 
        name = new JLabel("Your Name:");
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        fname = new JTextField();
        fname.setSize(100, 20);
        fname.setLocation(200, 100);
        lname = new JTextField();
        lname.setSize(100, 20);
        lname.setLocation(310, 100);
        c.add(fname); c.add(lname);
        
        dob = new JLabel("Birth Date:");
        dob.setSize(100, 20);
        dob.setLocation(100, 150);
        c.add(dob);
 
        month = new JComboBox(months);
        month.setSize(60, 20);
        month.setLocation(200, 150);
        c.add(month);
        
        date = new JComboBox(dates);
        date.setSize(50, 20);
        date.setLocation(265, 150);
        c.add(date);
 
        year = new JComboBox(years);
        year.setSize(60, 20);
        year.setLocation(320, 150);
        c.add(year);
 
        email = new JLabel("Email Address:");
        email.setSize(100, 20);
        email.setLocation(100, 200);
        c.add(email);
 
        temail = new JTextField();
        temail.setSize(150, 20);
        temail.setLocation(200, 200);
        c.add(temail);
        
        mno = new JLabel("Mobile Number:");
        mno.setSize(100, 20);
        mno.setLocation(100, 250);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setSize(150, 20);
        tmno.setLocation(200, 250);
        c.add(tmno);
 
        add = new JLabel("Address:");
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        c.add(tadd);
        
        gender = new JLabel("Gender");
        gender.setSize(100, 20);
        gender.setLocation(100, 400);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 400);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 400);
        c.add(female);
        
        other = new JRadioButton("Other");
        other.setSelected(false);
        other.setSize(75, 20);
        other.setLocation(360, 400);
        c.add(other);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        gengp.add(other);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            res.setText("Registration Successfull");
        }
 
    }
}
public class RegistrationForm {

    public static void main(String[] args) throws Exception{
         MyFrame f = new MyFrame();
    }
}
