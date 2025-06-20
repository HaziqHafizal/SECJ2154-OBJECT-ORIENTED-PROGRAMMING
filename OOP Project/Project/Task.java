public abstract class Task implements TimeTrackable 
{
    protected String description;
    protected String startTime;
    protected String endTime;

    public Task(String description, String startTime, String endTime) 
    {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDescription() 
    {
        return description;
    }

    public String getStartTime() 
    {
        return startTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }

    public long getDuration() 
    {
        try 
        {
            String[] start = startTime.split(":");
            String[] end = endTime.split(":");
            int startMin = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
            int endMin = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]);
            if (endMin < startMin) 
            {
                throw new IllegalArgumentException("End time must be after start time.");
            }
            return endMin - startMin;
        } catch (Exception e) 
            {
                System.out.println("Error calculating duration: " + e.getMessage());
                return 0;
            }
    }

    public abstract String getType();
}
