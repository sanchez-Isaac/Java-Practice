import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//INSERTING, UPDATING, and DELETING data using JDBC

public class JDBCDemo4 {
    //To make this work, remember to add the mysql-connector-java-8.0.27.jar
    //and then add it into the java path

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        int rowsAffected;// hold the rows affected value returned from executeUpdate

        try {
            //This allows a connection to a sql Database
            Connection conn = DriverManager.getConnection(url,"root", "password123");
            //Create a statement object to send to the DB
            Statement statement = conn.createStatement();
            //Execute the Statement object
            //The executeUpdate SQL method doesn't need to hold values
            rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5900 WHERE id = 700");

            //Process the result
            System.out.println("We executed a UPDATE Statement. - Rows afected: "+ rowsAffected);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Error While UPDATING");
        }

    }

}
