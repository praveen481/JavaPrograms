public class SumOfDigits
{
    //WAP to calculate sum of three digit number(567------5+6+7)

    public static void main(String[] args)
    {
        int num=567;
        int rem=num%10;     //rem=7
        int q1=num/10;      //q1=56
        int q2=q1%10;       //q2=6
        int q3=q1/10;       //q3=5

        System.out.println("Sum= "+(rem+q2+q3));
    }
}
