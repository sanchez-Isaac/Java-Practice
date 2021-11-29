import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    //To make this work, remember to add the mysql-connector-java-8.0.27.jar
    //and then add it into the java path

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";


        try {
            //This allows a connection to a sql Database
            Connection conn = DriverManager.getConnection(url,"root", "password123");
            //Create a statement object to send to the DB
            Statement statement = conn.createStatement();
            //Execute the Statement object
            //resultSet will hold the data from the DB
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            //Process the result - This is exactly the same as PHP
			/*while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}*/

            //This is another example of retrieving data
            int salaryTotal = 0;
            while(resultSet.next()) {
                salaryTotal= salaryTotal +resultSet.getInt("salary");

            }
            System.out.println(salaryTotal);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
