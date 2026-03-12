public class ATMSystem {

    public static void main(String[] args) {
        checkBalance(5000);
    }

    static void checkBalance(int balance) {

        System.out.println("Checking Balance...");

        if (balance >= 10000) {
            System.out.println("High Balance");
        } 
        else if (balance >= 5000) {
            System.out.println("Medium Balance");
        } 
        else {
            System.out.println("Low Balance");
        }

        transactionType();
    }

    static void transactionType() {

        int choice = 1;

        System.out.println("\nTransaction Type:");

        switch (choice) {
            case 1:
                System.out.println("Withdraw");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            default:
                System.out.println("Invalid Option");
        }

        countTransactions();
    }

    static void countTransactions() {

        System.out.println("Counting Transactions (FOR Loop)");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Transaction " + i);
        }

        securityCheck();
    }

    static void securityCheck() {

        System.out.println("\nSecurity Check (WHILE Loop)");

        int attempts = 1;

        while (attempts <= 2) {
            System.out.println("Attempt " + attempts);
            attempts++;
        }

        printReceipt();
    }

    static void printReceipt() {

        System.out.println("\nPrinting Receipt (DO WHILE)");

        int i = 1;

        do {
            System.out.println("Receipt Copy " + i);
            i++;
        } while (i <= 2);
    }
}
