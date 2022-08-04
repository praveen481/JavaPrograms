import java.util.Scanner;

public class Second
{
    public static void main(String[] args)
    {
        System.out.println("Enter Values");
        Scanner scanner=new Scanner(System.in);
       int a= scanner.nextInt();
       double b=scanner.nextDouble();
       String s=scanner.next();
       char ch=s.charAt(1);

       System.out.println(a+" "+b+" "+s+" "+ch);

    }
}
