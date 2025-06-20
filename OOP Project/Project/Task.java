import java.time.LocalDate;

public abstract class Task implements TimeTrackable {
    protected int duration;
    protected LocalDate date;

    public Task(int duration, LocalDate date) {
        this.duration = duration;
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public abstract String getTaskType();
}
