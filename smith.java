// a smith number is a composite number the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorisation (excluding 1)
//the first few such numbers are 4 22 27 58 85 94 121 so on. eg 666 prime factors are 2 3 3 37. sum of digts are 2+3+3+(3+7)=18
/// 4937775 prime factors are 3 5 5 65837. sum of the digts are 4+9+3+7+7+7+5=42 sum of the digts of factors 3+5+5+6+5+8+3+7.
// WAP to input a number a number and display weather a number is a smith no or not. 
import java.util.*;
class smith
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=Sc.nextInt();
    int no=n;
    int suma=0;
    int sumb=0;
    int r=0;
    int c=0;
    while(no>0)
     {
      int rem=no%10;
      suma=suma+rem;
      no=no/10;
    }
    while(n>1)
    {
        for(int i=2;i<n;i++)
        {
                if(n%i==0 )
                {  
                if(i<=9)
                {
                    sumb=sumb+i;
                    n=n/i;
                    i--;
            }
        }
            else
            {
                c=i;
                while(c>0)
                {
                    r=c%10;
                    sumb=sumb+r;
                    c=c/10;
                }
                n=n/i;
                i--;
         }
             }
    }
                    if(suma==sumb)
    {
        System.out.println("YES "+suma+" "+sumb);
    }
    else
     System.out.println("NO "+suma+" "+sumb);
    }
    }