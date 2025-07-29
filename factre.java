import java.util.*;
class factre
{
  static int f=1;
  static int cal(int no,int ii)
  {
        if(ii<=no)
        {
        f=f*ii;
        ii=ii+1;
        cal(no,ii);
    }    
    return f;
  }
   public static void main(String args[])
  {
   Scanner Sc=new Scanner(System.in);
   int n=Sc.nextInt();
   int i=1;
   factre obj=new factre();
   int x=cal(n,i);
   System.out.println(x);
  }
}