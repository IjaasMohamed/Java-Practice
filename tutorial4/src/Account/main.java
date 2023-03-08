package Account;

public class main {
    public static void main(String[] args) {
        FixedDepositAccount fx1 = new FixedDepositAccount();
        SavingAccount sa1 = new SavingAccount();

        fx1.deposit(105000);
        sa1.withdraw(5000);
    }
}
