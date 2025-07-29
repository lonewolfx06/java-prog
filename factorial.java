 import java.util.*;
class factorial
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter no");
        int num=Sc.nextInt();
        int fact=1;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
            sum=sum+fact;
        }
        System.out.println("sum of factorial of entered no "+num+" is "+sum); 
    }
    
}