import java.util.*;
class perfect
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter a number and we will tell if it is perfect or not");
        int no=Sc.nextInt();
        int sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            sum=sum+i;
        }
        if(sum==no)
        System.out.println("Perfect number");
        else
        System.out.println("Not perfect number");
    }
}