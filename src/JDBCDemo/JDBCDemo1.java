package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1.Loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Creating a connection

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. creating a statement

        Statement st = con.createStatement();

        // 4. Execute query


       // String sql = "insert into student values(6,'Vikas','IT',95)";
      //  String sql = "update student set name='ghanshyam' where rno=6";
        String sql = "delete from student where rno=6";

        st.executeUpdate(sql); // DML

    }
}
