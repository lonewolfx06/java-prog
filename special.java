import java.util.*;
class special
{
    static int sum,f;
    special()
    {
        sum=0;
        f=1;
    }
    static int fact(int n)
     {
         f=1;
    if(n>0)
    {
     int r=n%10;
     while(r>0)
     {
         f=f*r;
         r--;
        }      
     sum=sum+f;
     n=n/10;
     fact(n);
    }
    return sum;
    }
    void isspecial(int no)
    {
        int x=fact(no);
        if(x==no)
        System.out.println("yes is special SUIIIIII"+x+" "+no);
        else 
        System.out.println("ITNE CHANTE MARUNGA MAAR MAAR KE TERI TANT LAL KAR DOONGA "+x+" "+no);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        special obj=new special();
        obj.isspecial(num);
    }
}