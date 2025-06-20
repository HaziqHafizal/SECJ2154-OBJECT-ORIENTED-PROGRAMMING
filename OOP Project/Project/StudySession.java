public class StudySession extends Task 
{
    public StudySession(String description, String startTime, String endTime) 
    {
        super(description, startTime, endTime);
    }

    public String getType() 
    {
        return "Study";
    }
}
