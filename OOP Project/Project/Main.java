public class Main 
{
    public static void main(String[] args) {
        User user = new User("Haziq");
        LogManager manager = new LogManager(user);
        manager.start();
    }
}

