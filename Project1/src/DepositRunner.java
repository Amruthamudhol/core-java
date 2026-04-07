import com.xworkz.bank.Account;
import com.xworkz.bank.Deposit;

public class DepositRunner {

    public static void main(String[] args) {

        Account acc = new Account(101, "Amruta", 50000);

        Deposit deposit = new Deposit(10000);
        deposit.depositToAccount(acc);

        acc.displayAccount();
    }
}