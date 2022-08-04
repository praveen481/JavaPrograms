public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int a=20, b=10; //10100 & 01010

        //As it is bitwise operator, it will compare only binary values

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a>>1);
        System.out.println(b<<2);
    }
}
