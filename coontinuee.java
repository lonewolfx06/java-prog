 import java.util.*;
class coontinuee
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter no");
        for(int i=1;i<=5;i++)
        {
            int no=Sc.nextInt();        
            System.out.println(no);
            continue;
        }
    }
}