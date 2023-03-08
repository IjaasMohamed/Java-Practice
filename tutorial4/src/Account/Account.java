package Account;

public abstract class Account {
    private String accountNo, name;
    double balance;

    Account() {

    }

    Account(String accountNo, String name, double balance){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance = amount + this.balance;
    }
    public abstract double calculateIntrest();

    public void display(){
        System.out.println("accountNo = " + this.accountNo);
        System.out.println("name = " + this.name);
        System.out.println("amount = " + this.balance);
    }
}
