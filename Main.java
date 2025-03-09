
public class Main {
    public static void main(String[] args) {
        BankAccount savings=new SavingsAccount("Emre",60000);
        BankAccount checking=new CheckingAccount("Nisa",55000);

        System.out.println("<--Vadeli Hesap Bilgileri-->");
        savings.showInformation();
        savings.calculateInterest();

        System.out.println("<--Vadesiz Hesap Bilgileri-->");
        checking.showInformation();
        checking.calculateInterest();
    }
}