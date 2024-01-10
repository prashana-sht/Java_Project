
package dbconnect1;
import java.sql.*;
import java.io.*;
public class DBConnect1 {
   
    public static void main(String[] args) {
 try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con= null;
con=DriverManager.getConnection("jdbc:mysql://localhost/acd","root",""); 
System.out.println("Database connected!!");
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
String q1= "INSERT INTO acdtest (name,roll,addr) values('Raj',01111,'KTM')";
stmt.executeUpdate(q1);
ResultSet rs=stmt.executeQuery("select * from acdtest");  
while(rs.next())  
System.out.println(rs.getString("name")+"  "+rs.getInt("roll")+"  "+rs.getString("addr"));  
con.close();  
}
 catch(Exception e)
{ System.out.println(e);}  
    }
}
