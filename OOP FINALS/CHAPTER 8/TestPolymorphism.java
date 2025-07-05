public class TestPolymorphism
{
    public static void main(String[] args)
    {
        Animal a1 = new Dog("Rocky");
        Animal a2 = new Cat("Sheenta");

        a1.makeSound(); //Bark
        a2.makeSound(); //Meow

        //Interface polymorphism
        Speakable s1 = new Dog("Rex");
        Speakable s2 = new Cat("Ms Meow");

        System.out.println(s1.speak());
        System.out.println(s2.speak());

        //Safe downcasting with instanceof
        if(a1 instanceof Dog)
        {
            Dog d = (Dog) a1;
            d.wagTail(); //Only Dog has this method
        }

        if(a2 instanceof Cat)
        {
            Cat c = (Cat) a2;
            c.purr();
        }

        //Using array of Animal (polymorphism in array)
        Animal[] animals = {new Dog("Max"), new Cat("Luna")};
        for(Animal a : animals)
        {
            a.makeSound();
        }
    }
}
