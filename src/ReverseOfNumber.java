public class ReverseOfNumber
{
    public static void main(String[] args)
    {
        int num=567;
        int rem=num%10;        //rem=7
        int q1=num/10;         //q1=56
        int q2=q1%10;           //q2=6
        int q3=q1/10;           //q3=5

        int rev= q3+ q2*10+rem*100;

        System.out.println("reverse ="+ rev);
    }
}
