public class TestClassRelationship 
{
    public static void main(String[] args)
    {
        //Association: Student registers Course
        Course oop = new Course("OOP", "SCP3103", 3);
        Course dsa = new Course("DSA", "SCJ1213", 3);
        Student s1 = new Student("Hafiz", "A23CS0130");

        s1.registerCourse(oop);
        s1.registerCourse(dsa);
        s1.printCourses();

        //Aggregation: Faculty has Courses
        Faculty f1 = new Faculty("FSKSM");
        f1.addCourse(oop);
        f1.addCourse(dsa);
        f1.printCourses();

        //Composition: Person owns Name and Address
        Person p1 = new Person();
        p1.printInfo();
    }
}
