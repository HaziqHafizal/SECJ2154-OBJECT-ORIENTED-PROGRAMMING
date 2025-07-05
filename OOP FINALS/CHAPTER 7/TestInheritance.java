public class TestInheritance 
{
    public static void main(String[] args)
    {
        System.out.println("--- Creating Lecturer Object ---");
        Lecturer lect = new Lecturer("Dr. Haziq", 22, "Senior Lecturer", 6500.0, "Object Oritented Programming");
        lect.displayInfo();
    }
}
