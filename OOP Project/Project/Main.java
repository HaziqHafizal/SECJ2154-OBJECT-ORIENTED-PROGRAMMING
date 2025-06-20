import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogManager manager = new LogManager();

        boolean running = true;

        while (running) {
            System.out.println("\n==== Campus Productivity Logger ====");
            System.out.println("1. Create User");
            System.out.println("2. Switch User");
            System.out.println("3. Add Study Session");
            System.out.println("4. Add Break Session");
            System.out.println("5. View Tasks on Specific Date");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter new user name: ");
                    String newName = scanner.nextLine();
                    manager.addUser(newName);
                    System.out.println("User created.");
                    break;
                case "2":
                    System.out.print("Enter user name to switch: ");
                    String switchName = scanner.nextLine();
                    if (manager.switchUser(switchName)) {
                        System.out.println("Switched to user: " + switchName);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case "3":
                case "4":
                    if (manager.getCurrentUser() == null) {
                        System.out.println("Please switch to a user first.");
                        break;
                    }
                    try {
                        System.out.print("Enter duration (minutes): ");
                        int duration = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        LocalDate date = LocalDate.parse(scanner.nextLine());

                        Task task = choice.equals("3")
                            ? new StudySession(duration, date)
                            : new BreakSession(duration, date);

                        manager.getCurrentUser().addTask(task);
                        System.out.println(task.getTaskType() + " added.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format.");
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format.");
                    }
                    break;
                case "5":
                    if (manager.getCurrentUser() == null) {
                        System.out.println("Please switch to a user first.");
                        break;
                    }
                    try {
                        System.out.print("Enter date to search (YYYY-MM-DD): ");
                        LocalDate searchDate = LocalDate.parse(scanner.nextLine());
                        List<Task> found = manager.getTasksByDate(searchDate);
                        if (found.isEmpty()) {
                            System.out.println("No tasks found on that date.");
                        } else {
                            for (Task task : found) {
                                System.out.println(task.getTaskType() + " - " + task.getDuration() + " mins");
                            }
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format.");
                    }
                    break;
                case "6":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
