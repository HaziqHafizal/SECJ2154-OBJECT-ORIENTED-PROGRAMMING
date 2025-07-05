public class Student 
{
    private String name;
    private String matrix;
    private Course[] courseList;
    private int numOfCourse;

    public Student(String name, String matrix)
    {
        this.name = name;
        this.matrix = matrix;
        this.courseList = new Course[5];
        this.numOfCourse = 0;
    }

    public void registerCourse(Course c)
    {
        courseList[numOfCourse++] = c;
    }

    public void printCourses()
    {
        System.out.println("\nStudent: " + name);
        System.out.println("Registered Courses: ");
        for(int i=0; i<numOfCourse; i++)
        {
            System.out.println((i+1) + ". " + courseList[i].getName());
        }
    }
}
