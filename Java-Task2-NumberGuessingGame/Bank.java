public class Bank {

    private ATM atm;
    private Transaction transaction;

    public Bank(ATM atm, Transaction transaction) {
        this.atm = atm;
        this.transaction = transaction;
    }

    public ATM getATM() {
        return atm;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}
