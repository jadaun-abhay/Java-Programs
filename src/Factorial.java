import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial
{
    int getFactorial(int num)
    {
        if (num == 0)
            return 1;
        return num*getFactorial(num - 1);
    }

    void printFactorial(int num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }

    String getUserInput(String message) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("%s : ", message);
        return br.readLine();
    }


    public static void main(String[] args) throws IOException
    {
        Factorial fc = new Factorial();

        String message = """
                Enter an appropriate choice by following the given options :\
                
                1. To print factorial of a given number using looping.\
                
                2. To print factorial of a given number using recursion.\
                
                3. To exit.
                """;

        System.out.println(message);

        int choice = Integer.parseInt(fc.getUserInput("Enter your choice"));
        int number;

        switch (choice)
        {
            case 1:
                number = Integer.parseInt(fc.getUserInput("Enter the number"));
                System.out.printf("Factorial of %d = ", number);
                fc.printFactorial(number);
                break;
            case 2:
                number = Integer.parseInt(fc.getUserInput("Enter the number"));
                System.out.printf("Factorial of %d = %d", number, fc.getFactorial(number));
                break;
            case 3:
                System.out.print("Exiting ...");
                System.exit(0);
        }
    }
}
