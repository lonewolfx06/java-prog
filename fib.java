import java.util.*;
class fib
{
    static int c=0,aa=1,bb=0;
    static int cal(int no,int ii)
    {
        if(ii<=no-1)
        {
            System.out.println(c);
            c=aa+bb;
            aa=bb;
            bb=c;
            ii=ii+1;
            cal(no,ii);
        }
        return c;
    }
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int i=1;
        fib obj=new fib();
        int x=cal(n,i);
        System.out.println(x);
    }
}
