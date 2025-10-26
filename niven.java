import java.util.*;
class niven
{
    static int sum=0;
    static int n;
    niven()
    {
        n=0;
    }
    niven(int nn)
    {
        n=nn;
    }
    int calniven(int x)
    {
        if(x>0)
        {
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
            calniven(x);
        }
        return sum;
    }
    void check()
    {
        int s=calniven(n);
        if(n%s==0)
        {
            System.out.println("YEs");
        }
        else
        System.out.println("NO");
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        niven obj=new niven(n);
        obj.check();
    }
}