import java.util.*;
class au
{
    static int fact=1;
    static int cal(int no,int ii)
    {
     
     if(ii<=no)
     {
         fact=fact*ii;
         ii=ii+1;
         cal(no,ii);
        }
        return fact;
     }
     static void main(String args[])
     {
         Scanner Sc=new Scanner (System.in);
         int n= Sc.nextInt();
         int i=1;
         au obj =new au();
         int x=cal(n,i);
         System.out.println(x);
     }
    }
