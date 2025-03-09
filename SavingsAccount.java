public class SavingsAccount extends BankAccount{

    public SavingsAccount(String AccountHolder, double balance) {
        super(AccountHolder, balance);
    }
    public void calculateInterest() {
        double interest=balance*0.05;
        System.out.println("Alınan faiz:" + interest);
    }
}
