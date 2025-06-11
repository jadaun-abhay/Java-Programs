import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries
{
    public int getFibonacciTerm(int n)
    {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (getFibonacciTerm(n -1) + getFibonacciTerm(n - 2));
    }

    public void printFibonacciSeries(int n)
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        int term;
        for (int i = 1; i <= n-2; i++)
        {
            term = a + b;
            if (i != n-1)
                System.out.print(", ");
            System.out.print(term);
            a = b;
            b = term;
        }
    }

    public int getUserInput(String message) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print(message + ": ");
        return Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException
    {
        FibonacciSeries fs = new FibonacciSeries();

        int choice;
        int num;

        String message = """
                Enter your choice according to the following options:\
                
                1. To print the fibonacci series using looping method\
                
                2. To print the fibonacci series using recursion method\
                
                3. To exit the program""";
        System.out.println(message);
        choice = fs.getUserInput("Enter the number of terms");
        switch (choice)
        {
            case 1:
                num = fs.getUserInput("Enter the number of terms");
                fs.printFibonacciSeries(num);
                break;
            case 2:
                num = fs.getUserInput("Enter the number of terms");
                System.out.print("Fibonacci series : ");
                for (int i = 1; i <= num; i++)
                {
                    System.out.print(fs.getFibonacciTerm(i));
                    if (i != num)
                        System.out.print(", ");
                }
                break;
            case 3:
                System.out.println("Exiting ...");
                System.exit(0);
        }

    }
}
