import java.util.*;
class quotient 
{
    static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int sum=0;
        int s=1;
        int b=a;
        int i=1;
        int c=a;
        int co=0;
        while(b>0)
        {
            co=co+1;
            b=b/10;
        }
        while(a>0)
       {
        int rem=a%10;
        do
        {
            sum=sum+rem;
            s=s*rem;
            i++;
        }
        while(i<=co);
        a=a/10;
       }
               if(s==sum)
        {
          System.out.println("It is a spy");
        }else
        {
         System.out.print("-_-"+sum+s);
         }
  }
}
