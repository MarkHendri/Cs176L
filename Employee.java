
public class Employee {
    private String name;
    private double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        if (byPercent >= 0) {
            double raiseAmount = salary * (byPercent / 100.0);
            salary += raiseAmount;
        } else {
            System.out.println("Invalid percentage. Salary not raised.");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Mark Hendri", 9999.9);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Initial Salary: " + employee.getSalary());

        employee.raiseSalary(10);

        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
