import java.util.*;
class pyramid
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int sp=5;sp>=i;sp--)
            {
                System.out.print("  ");
            }
            for(int st=1;st<=2*i-1;st++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}