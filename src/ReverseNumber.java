import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a number :");
        int number = Integer.parseInt(br.readLine());

        int reverseNumber = 0;
        int digit;

        while (number > 0)
        {
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse Number : " + reverseNumber);
    }
}
