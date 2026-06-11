import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments_db", "root", "4AI22CS005");
            Statement statement = connection.createStatement();

            String sqlQuery = "delete from payment_info where account_no = 12345";
            int rowsAffected = statement.executeUpdate(sqlQuery);

            System.out.println("Rows Deleted: " + rowsAffected);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}