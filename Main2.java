
public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager(1,"Emre",70000,"Satış",5);
        Developer developer=new Developer(2,"Berat",55000,"Developer","FullStack Developer");

        System.out.println("<--Yönetici Bilgileri-->");
        manager.showInfo();
        System.out.println("<--Geliştirici Bilgileri-->");
        developer.showInfo();
    }
}