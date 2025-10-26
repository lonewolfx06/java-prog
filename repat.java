import java.util.*;
class repat
{
    static int i, j;
    static int cal(int x)
    {
        i=1;j=1;
        if(i<=x)
        {
          if(j<=i)
          {
            }
          System.out.println(" ");
          i++;
        }
        cal(x);
        return x;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        repat obj=new repat();
        int l=cal(a);
    }
}