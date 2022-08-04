import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        System.out.println("Enter Year");
        Scanner scanner=new Scanner(System.in);
        int year = scanner.nextInt();
        if((year %400==0)||(year%4==0 && year%100!=0))
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");

        }
    }
}
