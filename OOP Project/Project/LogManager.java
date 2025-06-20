import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LogManager {
    private ArrayList<User> users;
    private User currentUser;

    public LogManager() {
        users = new ArrayList<>();
    }

    public void addUser(String name) {
        users.add(new User(name));
    }

    public boolean switchUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public List<Task> getTasksByDate(LocalDate date) {
        List<Task> result = new ArrayList<>();
        if (currentUser != null) {
            for (Task task : currentUser.getTasks()) {
                if (task.getDate().equals(date)) {
                    result.add(task);
                }
            }
        }
        return result;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
