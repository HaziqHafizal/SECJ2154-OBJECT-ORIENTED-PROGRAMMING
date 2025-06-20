public class BreakSession extends Task 
{
    public BreakSession(String description, String startTime, String endTime) 
    {
        super(description, startTime, endTime);
    }

    public String getType() 
    {
        return "Break";
    }
}
