import java.util.*;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            //May throw InputMismatchException
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();

            //May throw ArithmeticException
            int result = 100;
            System.out.println("Result: " + result);

            //May throw custom exception
            checkNumber(num);
        } catch (InputMismatchException e){
            System.out.println("Input error: Please enter an intger");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Cannot divide by zero");

        } catch (MyException e) {
            System.out.println("Custom error: " + e.getMessage());

        } finally {
            System.out.println("Program finished");
        }

        sc.close();
    }

    public static void checkNumber(int number) throws MyException
    {
        if (number < 0) 
        {
            throw new MyException("Negative number is not allowed");
        }
    }
}