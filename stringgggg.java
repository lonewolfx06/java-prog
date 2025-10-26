import java.util.*;
class stringgggg
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        int le=a.length();
        char o=a.charAt(0);
        String o1=Character.toString(o);
        String o2=o1.toUpperCase();
        char l=a.charAt(le-1);
        String l1=Character.toString(l);
        String l2=l1.toUpperCase();
        String b=a.substring(1,le-1);
        System.out.println(le);
        System.out.println(o2+b+l2);
    }
}