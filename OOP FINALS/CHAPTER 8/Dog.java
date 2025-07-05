//Subclass of Animal, implements Speakable
public class Dog extends Animal implements Speakable
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println(name + " says: BARK");
    }

    @Override
    public String speak()
    {
        return "Woof!";
    }

    public void wagTail()
    {
        System.out.println(name + " is wagging its tail");
    }
}
