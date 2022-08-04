public class Array2D
{
    public static void main(String[] args)
    {
        int ar[][]=new int[2][2];
        ar[0][0]=12;
        ar[0][1]=34;
        ar[1][0]=90;
        ar[1][1]=78;

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }




    }
}
