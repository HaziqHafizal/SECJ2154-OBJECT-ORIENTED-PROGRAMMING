//Composition(Person owns Name and Address - Strong Ownership)
public class Name 
{
    private String first;
    private String last;
    
    public Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    public String getFullName()
    {
        return first + " " + last;
    }
}
