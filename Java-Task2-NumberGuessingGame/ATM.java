public class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}
