import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber
{
    boolean isPrimeNumber(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    String getUserInput(String message)throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("%s: ", message);

        return br.readLine();
    }
    public static void main(String[] args) throws IOException
    {
        PrimeNumber pn = new PrimeNumber();
        int num = Integer.parseInt(pn.getUserInput("Enter a number"));
        boolean isPrime = pn.isPrimeNumber(num);
        if (isPrime)
        {
            System.out.printf("%d is a prime number.", num);
        }
        else
        {
            System.out.printf("%d is not a prime number.", num);
        }

    }
}
