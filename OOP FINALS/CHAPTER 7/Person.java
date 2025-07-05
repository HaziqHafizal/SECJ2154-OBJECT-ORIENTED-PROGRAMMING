public class Person
{
    protected String name;
    protected int age;

    public Person()
    {
        System.out.println("Person's no-arg constructor called");
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Person's parameterised constructor called");
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}