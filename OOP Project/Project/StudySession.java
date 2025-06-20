
import java.time.LocalDate;

public class StudySession extends Task {
    public StudySession(int duration, LocalDate date) {
        super(duration, date);
    }

    public String getTaskType() {
        return "Study Session";
    }
}
