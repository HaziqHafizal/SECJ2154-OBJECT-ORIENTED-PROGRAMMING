//Aggregation(Faculty has Courses - Loose Ownership)
public class Faculty 
{
    private String name;
    private Course[] courseList;
    private int numOfCourses;
    
    public Faculty(String name)
    {
        this.name = name;
        this.courseList = new Course[5];
        this.numOfCourses = 0;
    }

    public void addCourse(Course c)
    {
        courseList[numOfCourses++] = c;
    }

    public void printCourses()
    {
        System.out.println("\nFaculty: " + name);
        System.out.println("Offered Courses: ");
        for(int i=0; i<numOfCourses; i++)
        {
            System.out.println((i+1) + ". " + courseList[i].getName());
        }
    }
}
