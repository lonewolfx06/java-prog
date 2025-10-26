import java.util.*;
class strtoken
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer str=new StringTokenizer(s);
        System.out.println(str.countTokens());
        while(str.hasMoreTokens())
        {
         System.out.println(str.nextToken());
        }
    }
}