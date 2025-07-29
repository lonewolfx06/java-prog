import java.util.*;
class num_dude
{
    int num;
    static int sum=0;
    num_dude()
    {
        num=0;
    }
    void input()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is dudeny no or not");
        int num=Sc.nextInt();
    }
    static int sum_digits(int x)
    {
        int rem=0;
        if(x>0)
        {
            rem=x%10;
            sum=sum+rem;
            x=x/10;
            sum_digits(x);
        }
        return sum;
    }
    void ishappy()
    {
        int a=num;
        double n=Math.cbrt(num);
        int j=sum_digits(a);
        int l=(int)n; 
        if(l==j)
        System.out.println("YES it is a dudeny number "+l+" "+j);
        else
        System.out.println("NO it is not a dudeny number "+l+" "+j);
    }
    public static void main(String args[])
    {
         num_dude obj=new num_dude();
         obj.input();
         obj.ishappy();
    }
}