//Subclass of Animal, implements Speakable
public class Cat extends Animal implements Speakable
{
    public Cat(String name)
    {
        super(name);
    }

    @Override
    public void makeSound()
    {
        System.out.println(name + "says: MEOW");
    }

    @Override
    public String speak()
    {
        return "Meow Meow Nigga";
    }

    public void purr()
    {
        System.out.println(name + " is purring");
    }
}
