import java.util.*;
class string
{
    protected static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String a=Sc.nextLine();
        char b=a.charAt(0);
        String c=Character.toString(b);
        String d=c.toUpperCase();
        String e=a.replace(c,d);
        System.out.println(e);
    }
}