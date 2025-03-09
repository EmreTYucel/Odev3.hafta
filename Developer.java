public class Developer extends Employee{
    private String about;

    public Developer(int id, String name,double salary ,String department , String about) {
       super(id, name, salary, department);
       this.about = about;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Hakkında:"+about);
    }
    public double calculateBonus(){
    return salary * 0.10;
    }
}
