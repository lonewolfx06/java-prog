import java.util.*;
class fibre
{
  static int c=0;
  static int cal(int n,int aa,int bb,int i)
  {
      if(i<=n)
      {
              System.out.println(c);
              c=aa+bb;
              aa=bb;
              bb=c;
              i=i+1;
              cal(n,aa,bb,i);
      }
      return c;
  }
  public static void main(String args[])
  {
      Scanner Sc=new Scanner(System.in);
      int no=Sc.nextInt();
      int i=1,a=1,b=0;
      fibre obj=new fibre();
      int X=cal(no,a,b,i);
      System.out.println(X);
  }
}