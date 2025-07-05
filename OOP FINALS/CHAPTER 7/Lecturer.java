public class Lecturer extends Employee
{
    private String subject;

    public Lecturer()
    {
        System.out.println("Lecturer's no-arg constructor is called");
    }

    public Lecturer(String name, int age, String position, double salary, String subject)
    {
        super(name, age, position, salary);
        this.subject = subject;
        System.out.println("Lecturer's parameterized constructor called");
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }


}
