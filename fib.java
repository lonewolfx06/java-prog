 import java.util.*;
class fib
{
    public static void main(String args[])
    {
        int a=1,b=0,c=0;
        Scanner Sc=new Scanner(System.in);System.out.println("Enter the number");
        int n=Sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}