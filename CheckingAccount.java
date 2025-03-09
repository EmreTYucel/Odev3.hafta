public class CheckingAccount extends BankAccount{
public CheckingAccount(String AccountHolder,double balance ) {
    super(AccountHolder,balance);
}
 @Override
    public void calculateInterest() {
        System.out.println("Vadesiz hesap faiz kazandırmaz");
    }
}
