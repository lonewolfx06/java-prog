import java.util.*;
class prime
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter a number and we will tell if it is prime or not");
        int n=Sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
           count++; 
        }
        if(count==2)
        System.out.println("Yes it is a prime number");
        else
        System.out.println("No it is not a prime number");
    }
}