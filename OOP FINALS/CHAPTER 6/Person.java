public class Person 
{
   private Name name;
   private Address address;
   
   public Person()
   {
        name = new Name("Muhammad", "Haziq");
        address = new Address("Bandar Kinrara", "Selangor");
   }

   public void printInfo()
   {
        System.out.println("\nPerson Information");
        System.out.println("Name: " + name.getFullName());
        System.out.println("Address: " + address.getFullAddress());
   }
}
