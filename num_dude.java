import java.util.*;
class num_dude
{
    static int sum=0,n;   
    int num;
    num_dude()
    {
        n=0;
    }
    void input()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number and I will tell You if it is a dudeny number or not");
         num=Sc.nextInt();
    }
    static int sum_of_digits(int x)
    {
        if(x>0)
        {
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
            sum_of_digits(x);
        }
        return sum;
    }
    void ifdude()
    {
        double k=Math.cbrt(num); 
        int l=sum_of_digits(num);
        double j=(double)l;
        if(j==k)
        {
            System.out.println("SUUUIIIIII, It is a NUMDUDE NUMBER "+ j+" "+k );
        }
        else
        System.out.println("NO "+j+" "+k);
    }
    public static void main(String args[])
    {
        num_dude obj=new num_dude();
        obj.input();
        obj.ifdude();
    }
}