package Account;

public class FixedDepositAccount extends Account {
    protected double interestRate, interest;

    public void setInterestRate(double intrestRate){
        this.interestRate = interest;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public double calculateIntrest(){
        return this.interest = balance * (this.interestRate/100);
    }

}
