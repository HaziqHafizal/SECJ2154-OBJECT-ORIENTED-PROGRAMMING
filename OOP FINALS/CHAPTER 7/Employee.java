public class Employee extends Person
{
    protected String position;
    protected double salary;

    public Employee()
    {
        System.out.println("Employee's no-arg construtor called");
    }

    public Employee(String name, int age, String position, double salary)
    {
        super(name, age);
        this.position = position;
        this.salary = salary;
        System.out.println("Employee's parameterized constructor called");
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
