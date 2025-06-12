import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{

    static int getReversedNumber(int number)
    {
        int reversedNumber = 0;
        while (number > 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    static String getReversedString(String text)
    {
        StringBuilder reversedString = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--)
        {
            reversedString.append(text.charAt(i));
        }
        return reversedString.toString();
    }

    boolean isPalindromeNumber(int n)
    {
        return n == getReversedNumber(n);
    }

    boolean isPalindromeString(String str)
    {
        return str.equals(getReversedString(str));
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
        Palindrome pd = new Palindrome();

        String message = """
                Enter your choice according to the following menu given below :\
                
                1. To check whether the given number is palindrome.\
                
                2. To check whether the given text is palindrome.\
                
                3. To exit.
                """;
        System.out.println(message);

        int choice = Integer.parseInt(pd.getUserInput("Enter your choice"));

        switch (choice)
        {
            case 1:
                int num = Integer.parseInt(pd.getUserInput("Enter the number"));
                System.out.printf("%d is a palindrome number : %b", num, pd.isPalindromeNumber(num));
                break;
            case 2:
                String text = pd.getUserInput("Enter the text");
                System.out.printf("'%s' is a palindrome string : %b", text, pd.isPalindromeString(text));
                break;
            case 3:
                System.out.println("Exiting ...");
                System.exit(0);
        }
    }
}
