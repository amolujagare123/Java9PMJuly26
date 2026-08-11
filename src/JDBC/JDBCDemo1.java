package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/myschool";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. execute query

        String sql = "insert into student values(21,'Kavisha','IT',90);";

        // update & delete query

        st.executeUpdate(sql);


    }
}
