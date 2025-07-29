 import java.util.*;
class fibonacci  
{
    public static void main (String args[])
    {
        int a=1,b=0,c=0,j=1;
        String name;
        Scanner Sc=new Scanner(System.in);
        name=Sc.nextLine();
        System.out.println("Enter a no");
        int i=Sc.nextInt();
        do
        {
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
            j++;
        }
        while(j<=i);
    }
}