package Account;

public class SavingAccount extends FixedDepositAccount{
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double calculateInterest(){
        return interest = balance * interestRate/100/12;
    }
}
