 import java.util.*;
class loopfortable
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in); 
        System.out.println("Enter no of which you want to know table");
        int n=Sc.nextInt();
        int t;
        for(int i=1;i<=20;i++)
        {
            t=n*i;
            System.out.println(n+"*"+i+"="+t);
            if(i==21)
            break;
        }
    }
}
