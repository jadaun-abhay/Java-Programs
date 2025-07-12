import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AutomorphicNumber
{
    int getSquare(int num)
    {
        return num*num;
    }

    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a number: ");
        String number = br.readLine();
        int length = number.length();
        int num = Integer.parseInt(number);

        AutomorphicNumber an = new AutomorphicNumber();

        int square = an.getSquare(num);

        int divisor = (int) Math.pow(10, length);

        boolean check = (square % divisor) == num;
        if (check)
        {
            System.out.printf("%d is an automorphic number.", num);
        }
        else
        {
            System.out.printf("%d is not an automorphic number.", num);
        }
    }
}
