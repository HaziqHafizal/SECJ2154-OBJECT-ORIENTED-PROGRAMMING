import java.time.LocalDate;

public class BreakSession extends Task {
    public BreakSession(int duration, LocalDate date) {
        super(duration, date);
    }

    public String getTaskType() {
        return "Break Session";
    }
}
