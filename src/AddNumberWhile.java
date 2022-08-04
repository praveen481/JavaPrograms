import java.util.Scanner;

public class AddNumberWhile
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();  
        int sum=0;

        while(num!=0)
        {
            int rem=num%10;
            num=num/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
