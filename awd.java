import java.util.*;
class awd
{
    void perf(int p)
    {
        int x;
        for(int i=1;i<=p;i++)
        {
            x=trail(i);
            System.out.println("    "+x+"    ");
        }
    }
    int trail(int n)
    {
        if(n==1)
        return 2;
        if(n==2)
        return 3;
        else
        return trail(n-2)+trail(n-1);
    }
      public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int o=15;
         awd obj=new awd();
        obj.perf(o);
    }
}