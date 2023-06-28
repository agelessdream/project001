package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtest1 {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/atguigudb";
        Connection connection= DriverManager.getConnection(url,"root","mysql123");
        System.out.println(connection);
    }
}
