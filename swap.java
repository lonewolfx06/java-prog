 import java.util.*;
class swap
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter 2 nos and I will swap their values");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        a=a-b;
        b=b+a;
        a=b-a;
        System.out.println("B is "+b);
        System.out.println("A is "+a);
    }
}