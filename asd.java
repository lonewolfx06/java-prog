import java.util.*;
class asd
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int x=check(n);
        System.out.println("Final-"+x);
    }
    static int check(int no)
    {
        System.out.println(no);
        if(no<=1)
        return 1;
        if(no%2==0)
        return 1+check(no/2);
        else
        return 1+check(no/2+1);
    }
}
