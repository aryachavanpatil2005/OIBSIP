import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account("Arya", 10000);
        ATM atm = new ATM(account);
        Transaction transaction = new Transaction();
        Bank bank = new Bank(atm, transaction);

        int choice;

        do {
            System.out.println("\n========== ATM INTERFACE ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bank.getATM().checkBalance();
                    transaction.addTransaction("Checked Balance");
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double deposit = sc.nextDouble();
                    bank.getATM().deposit(deposit);
                    transaction.addTransaction("Deposited ₹" + deposit);
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    double withdraw = sc.nextDouble();
                    bank.getATM().withdraw(withdraw);
                    transaction.addTransaction("Withdraw ₹" + withdraw);
                    break;

                case 4:
                    transaction.showHistory();
                    break;

                case 5:
                    System.out.println("Thank You for Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
