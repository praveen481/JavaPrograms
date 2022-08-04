import java.util.Scanner;

public class Array1
{
    public static void main(String[] args)
    {
        System.out.println("Enter Array Limit");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("Array Elements are");
        for(int x:a)
        {
            System.out.println(x);
        }

    }
}
