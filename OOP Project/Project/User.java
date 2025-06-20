import java.util.ArrayList;

public class User 
{
    private String name;
    private ArrayList<Task> tasks;

    public User(String name) 
    {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) 
    {
        tasks.add(task);
    }

    public void showSummary() 
    {
        System.out.println("\nSummary for " + name + ":");
        long totalStudy = 0, totalBreak = 0;

        for (Task t : tasks) 
        {
            System.out.printf("Session: %s | Description: %s | Start/End: %s-%s | Duration: %d mins\n", t.getType(), t.getDescription(), t.getStartTime(), t.getEndTime(), t.getDuration());
            if (t instanceof StudySession) 
            {
               totalStudy += t.getDuration(); 
            }
            
            else if (t instanceof BreakSession) 
            {
                totalBreak += t.getDuration();
            }
        }

        System.out.printf("\nTotal Study Time: %d mins\n", totalStudy);
        System.out.printf("Total Break Time: %d mins\n", totalBreak);
    }
}
