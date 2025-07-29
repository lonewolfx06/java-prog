import java.util.*;
class blue
{
    static void main (String args[])
    {
        String a="BLUE";
        int b=a.length();
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<=i;j++)
            {
                char c=a.charAt(j);
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}