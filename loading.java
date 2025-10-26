import java.util.*;
class loading 
{
     static int s=0;
    static int cal(int i)
    {
        
        if(i<=10)
        {
            s=s+i;
            i=i+1;
            cal(i);
        }
        return s;
    }
    public static void main(String args[])
    {
        int iii=1;
        loading obj=new loading();
        int x=cal(iii);
        System.out.println(x);
    }
}