import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumberGenerator
{
    int generateRandomNumber1(int min, int max)
    {
        return (int)(Math.random() * (max -min +1) + min);
    }

    int generateRandomNumber2(int upperBound)
    {
        Random rand = new Random();
        return rand.nextInt(upperBound);
    }

    String getUserInput(String prompt) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("%s : ", prompt);
        return br.readLine();
    }

    public static void main(String[] args) throws IOException
    {
        String message = """
                Enter your choice according to the following options:\
                
                1. To generate random number between given min and max.\
                
                2. To generate random number between 0 to given upper bound.\
                
                3. To exit.
                """;
        System.out.println(message);

        RandomNumberGenerator rng = new RandomNumberGenerator();

        int choice = Integer.parseInt(rng.getUserInput("Enter your choice"));
        int randomNumber;

        switch (choice)
        {
            case 1:
                int min = Integer.parseInt(rng.getUserInput("Enter the lower bound"));
                int max = Integer.parseInt(rng.getUserInput("Enter the upper bound"));

                randomNumber = rng.generateRandomNumber1(min, max);
                System.out.println("Random Number :" + randomNumber);
                break;
            case 2:
                int upperBound = Integer.parseInt(rng.getUserInput("Enter the upper bound"));

                randomNumber = rng.generateRandomNumber2(upperBound);
                System.out.println("Random Number :" + randomNumber);
                break;
            case 3:
                System.out.print("Exiting ...");
                System.exit(0);
        }
    }
}
