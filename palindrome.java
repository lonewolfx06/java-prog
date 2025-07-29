import java.util.*;
class palindrome
{
    void cal(int s,int r,int n)
    {
        int nu=n;
        while(n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==nu)
        System.out.println("Yes "+s);
        else
        System.out.println("NO "+s);
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=Sc.nextInt();
        int rem=0;
        int sum=0;
        palindrome obj=new palindrome();
        obj.cal(sum,rem,num);
    }
}