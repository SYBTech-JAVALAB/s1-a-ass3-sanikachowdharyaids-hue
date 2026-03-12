import java.util.Scanner;

abstract class bank_ {
    abstract void displayBank();
}

public class Ass3 extends bank_ {

    private int employeeID;

    public Ass3(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    // a) hours_worked and rate
    public double calculateSalary(int hours, double rate) {
        return hours * rate;
    }

    // b) ID with bonus
    public double calculateSalary(double salary, double bonus) {
        return salary + bonus;
    }

    // c) annual salary
    public double calculateSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    // d) with overtime
    public double calculateSalary(int hours, double rate, double overtime) {
        return (hours * rate) + overtime;
    }

    // e) with deductions
    public double calculateSalary(double salary, double deduction, boolean flag) {
        return salary - deduction;
    }

    // f) with bonus and deductions
    public double calculateSalary(double salary, double bonus, double deduction) {
        return salary + bonus - deduction;
    }

    // implementation of abstract class
    public void displayBank() {
        System.out.println("Bank: Payroll Processing System");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Ass3 emp = new Ass3(id);

        emp.displayBank();

        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter rate per hour: ");
        double rate = sc.nextDouble();

        double salary = emp.calculateSalary(hours, rate);
        System.out.println("Basic Salary = " + salary);

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        System.out.println("Salary with Bonus = " + emp.calculateSalary(salary, bonus));

        System.out.print("Enter monthly salary: ");
        double monthly = sc.nextDouble();
        System.out.println("Annual Salary = " + emp.calculateSalary(monthly));

        System.out.print("Enter overtime: ");
        double overtime = sc.nextDouble();
        System.out.println("Salary with Overtime = " + emp.calculateSalary(hours, rate, overtime));

        System.out.print("Enter deduction: ");
        double deduction = sc.nextDouble();
        System.out.println("Salary after Deduction = " + emp.calculateSalary(salary, deduction, true));

        System.out.println("Salary with Bonus and Deduction = "
                + emp.calculateSalary(salary, bonus, deduction));

        sc.close();
    }
}