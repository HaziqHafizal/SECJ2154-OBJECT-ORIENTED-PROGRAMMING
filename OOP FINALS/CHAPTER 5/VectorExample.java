import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        Vector<String> faculty = new Vector<String>();

        //Add elements
        faculty.add("FSKSM");
        faculty.addElement("FS");
        faculty.addElement("FKE");

        System.out.println("Initial Faculty: " + faculty);

        //Insert at index
        faculty.insertElementAt("FPPSM", 2);

        // Remove elements
        faculty.removeElement("FS");
        faculty.removeElement(2);

        faculty.setElementAt("FAB", 1);

        //Access elements
        System.out.println("\nFinal Faculty List: ");
        for (int i=0; i<faculty.size(); i++)
        {
            System.out.println((i+1) + ". " + faculty.elementAt(i));
        }

        System.out.println("\nTotal faculties: " + faculty.size());
    }
}
