import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber
{
    static int countDigits(int num)
    {
        int count = 0;
        while (num != 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }

    static int performArmstrongCalculation(int num, int digits)
    {
        int rem;
        int result = 0;
        while (num != 0)
        {
            rem = num % 10;
            result += (int)Math.pow(rem, digits);
            num /= 10;
        }
        System.out.println(result);
        return result;
    }

    boolean isArmstrongNumber(int num)
    {
        return num == performArmstrongCalculation(num, countDigits(num));
    }

    String getUserInput() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("%s : ", "Enter the number");
        return br.readLine();
    }

    public static void main(String[] args) throws IOException
    {
        ArmstrongNumber an = new ArmstrongNumber();

        int number = Integer.parseInt(an.getUserInput());
        System.out.printf("%d is Armstrong number: %b", number, an.isArmstrongNumber(number));
    }
}
