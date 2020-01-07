import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter n number");
        System.out.println("the program will compute the sum of n numbers");
        System.out.println("enter a number");
        int n = keyboard.nextInt();
        double value = 0;
        double sum = 0;
        for(int i = 1; i<= n; i++)
        {
            value = (i*i);
            System.out.println("value is: " +value);
            sum = sum + value;

        }
        System.out.println("sum is: " + sum);
    }
}
