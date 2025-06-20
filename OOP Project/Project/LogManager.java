import java.util.Scanner;

public class LogManager 
{
    private User user;

    public LogManager(User user) 
    {
        this.user = user;
    }

   public void start() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
	System.out.println("-----------------------");
	System.out.println("Welcome to StudyBuddy");
	System.out.println("-----------------------");
        System.out.println("[1] Log Study Session");
        System.out.println("[2] Log Break Session");
        System.out.println("[3] Show Summary");
        System.out.println("[4] Exit");
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("4")) 
        {
            System.out.println("Thank you, byebye !");
            break;
        } 
        else if (choice.equals("3")) {
            user.showSummary(); 
        }
        else if (choice.equals("1") || choice.equals("2")) {
            try {
                System.out.print("\nEnter description(name of task): ");
                String desc = scanner.nextLine();
                System.out.print("Enter start time (example 10:27): ");
                String start = scanner.nextLine();
                System.out.print("Enter end time (example 10:27): ");
                String end = scanner.nextLine();

                Task task;
                if (choice.equals("1")) {
                    task = new StudySession(desc, start, end);
                } else {
                    task = new BreakSession(desc, start, end);
                }

                long duration = task.getDuration(); // trigger validation
                user.addTask(task);
                System.out.println("Task added successfully.");
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Invalid time format. Use HH:mm format.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } 
        else {
            System.out.println("Invalid choice. Try again.");
        }
    }

    scanner.close();
}

}
