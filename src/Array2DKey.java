import java.util.Scanner;

public class Array2DKey
{
    public static void main(String[] args)
    {
        System.out.println("Enter number of Rows and Columns");
        Scanner scanner=new Scanner(System.in);
        int r= scanner.nextInt();
        int c=scanner.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("Enter Array Elements");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matrix= ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
