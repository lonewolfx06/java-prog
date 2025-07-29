//Write a program to solve a quadratic equation to find the value of Y=ax^2+bx+c if x>=4 and Y=-ax^2+bx-c if x<4
import java.util.*;
class quadraticequ
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        int a,b,c,x;
        double y;
        System.out.println("Enter the value of a");
        a=Sc.nextInt();
        System.out.println("Enter the value of b");
        b=Sc.nextInt();
        System.out.println("Enter the value of c");
        c=Sc.nextInt();
        System.out.println("Enter the value of X");
        x=Sc.nextInt();
        if(x>=4)
        {
            y=(int)a*Math.pow(x,2)+b*x+c/2*a;
            System.out.println(y);
        }
        else
        {
            y=(int)-a*Math.pow(x,2)+b*x-c/2*a;
            System.out.println(y);
        }
    }
}