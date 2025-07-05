//Association(Student registers Course - One to many)
public class Course
{
    private String name;
    private String code;
    private int section;

    public Course(String name, String code, int section)
    {
        this.name = name;
        this.code = code;
        this.section = section;
    }

    public String getName()
    {
        return name;
    }
}