import java.util.*;
class overload
{
    void cal(int aa,double bb)
    {
        double m=0;
        for(int i=1;i<=aa;i++)
        {
            m=i/bb+m;
        }
        System.out.println(m);
    }
    void cal(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=n*i;
        }
        System.out.println(f);
    }
    public static void main (String args[])
    {
        overload obj=new overload();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 1 for sum series and 2 for factorial and anything else to exit");
        int c=Sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter 2 numbers");
                int a=Sc.nextInt();
                double mm=Sc.nextDouble();
                obj.cal(a,mm);
                break;
            case 2:
                System.out.println("Enter the number whom you want to know factorial");
                int nn=Sc.nextInt();
                obj.cal(nn);
                break;
                default:
                    System.exit(0);
        }
    }
}