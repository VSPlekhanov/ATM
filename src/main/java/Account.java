public class Account {
    public static final Account account = new Account();

    private long balance = 0;

    private Account() {
    }

    synchronized public void withdraw(long amount) {
        if (amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amonut more then 0");
        }
        if (account.getBalance() - amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amonut more then 0");
        }

        balance -= amount;
    }

    synchronized void deposit(long amount) {
        if (amount < 0) {
            throw new RuntimeException("Wrong amount. Please, input amonut more then 0");
        }
        balance += amount;
    }

    public synchronized long getBalance() {
        return balance;
    }
}
