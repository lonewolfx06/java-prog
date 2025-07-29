import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number and we will tell if it is armstrong or not");
        int rem;
        int no=Sc.nextInt();
        int n=no;
        int count=0,num=n;
        double sum=0.0;
        while(n>0)
        {
            count=n/10;
        }
        for(int i=1;i<=no;i++)
        {
            rem=no%10;
            sum=sum+Math.pow(rem,count);
            no=no/10;
    }
    if(sum==num)
    System.out.println("YES It is armstrong");
    else
    
        System.out.println("NOO It is not armstrong");
  }
}
