import java.util.Scanner;

public class ReverseNumberWhile
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        while(num>0)
        {
            int rem=num%10;
            int a1=num/10;
            int a2=a1%10;
            int a3=a1/10;
            int rev=a3+a2*10+rem*100;
            System.out.println(rev);
            break;
        }
    }
}
