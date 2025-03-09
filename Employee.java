public class Employee {
     int id;
     String name;
     double salary;
     String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public double calculateBonus() {
        return 0;
    }

    public void showInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Bonus: " + calculateBonus());
    }
}
