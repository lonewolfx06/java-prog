import java.util.*;
class debi
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        String sum="";
        char b;
        String a="";
        while(n>0)
        {
          int rem=n%10;
          if(rem%2==0)
          {
              sum=sum+"0";
          }
          else
          {
              sum=sum+"1";
          }
            n=n/2;
        }
        int l=sum.length();
        for(int i=0;i<l;i++)
        {
            b=sum.charAt(i);
            a=b+a;
        }
            System.out.println(a);
        }
    }
