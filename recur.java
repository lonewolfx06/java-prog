import java.util.*;
class recur
{
    static int s=0;
    static int cal(int ii)
    {
        if(ii<=10)
        {
            s=s+1;
            System.out.println(s);
            ii=ii+1;
            cal(ii);
        }
        return s;
    }
    public static void main(String args[])
    {
        int i=1;
        recur obj=new recur();
        int x=cal(i);
        System.out.println(s);
    }
}