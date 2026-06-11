
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments_db", "root", "4AI22CS005");
            Statement statement = connection.createStatement();
            String sql = "insert into payment_info(holder_name, account_no, bank_name, balance) " + "values ('Amruta', 1245, 'SBI', 5000)";

            boolean result = statement.execute(sql);

            System.out.println("executed successfully");
            System.out.println("Result: " + result);

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}