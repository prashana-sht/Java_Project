package pkg3.pkg1.crud;
import java.sql.*;
import java.io.*;

public class CRUD {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
            System.out.println("Database connected!!");
            Statement stmt = con.createStatement();
            String q1 = "INSERT INTO student (name,roll,address) values ('Hari',20777,'KTM')";
            stmt.executeUpdate(q1);
            String q3 = "UPDATE student \n" +
                        "SET name = 'Alfred Schmidt', address = 'PKR'\n" +
                        "WHERE roll = 01111 ;";
            stmt.executeUpdate(q3);
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next())
                System.out.println(rs.getString("name") + "  " + rs.getInt("roll") + "  " + rs.getString("address"));
            con.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
