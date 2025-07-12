import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> townlist = new ArrayList<String>();

        //Add Element
        townlist.add("Kangar");
        townlist.add("Alor Setar");
        townlist.add("Penang");

        System.out.println("Initial List: " + townlist);

        //Modify elements
        townlist.set(0, "Muar");

        //Insert at index
        townlist.add(1, "Shah Alam");

        //Remove element
        townlist.remove("Penang");

        //Access Elements
        System.out.println("\nFinal Town List:");

        for(int i=0; i<townlist.size(); i++)
        {
            System.out.println((i +1) + ". " + townlist.get(i));
        }

        System.out.println("\nTotal towns: " + townlist.size());
    }
}