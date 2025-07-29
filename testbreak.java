 //Example of break and continue
import java.util.*;
class testbreak
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("What is the sum of 2 an 3");
        for(int i=1;i<=5;i++)
        {
            System.out.println("Options are a)1,b)4,c)11,d)5");
            int no=Sc.nextInt();
            if(no==5)
            break;
            System.out.println("Wrong answer");
        }
    }
}