public class BankAccount {
  String Accountholder;
  double balance;

public BankAccount(String Accountholder, double balance) {
    this.Accountholder = Accountholder;
    this.balance = balance;
}
public void calculateInterest(){}
public void showInformation(){
    System.out.println("Accountholder: " + Accountholder);
    System.out.println("Balance: " + balance);
}
}
