import java.util.*;
class overloadseries
{
 double series(double a,double n)
 {
  int p=2,i=1;double sum=0.0D;
  while(i<=n)
  {
    sum=i/Math.pow(a,p)+sum;
    p=p+3;
    i=i+3;
  }
  return sum;
 }
 double series(double n)
 {
     int a=0,b=0,c=1,sum2=0;
     for(int i=1;i<=n;i++)
     {
         c=a+b;
         a=b;
         b=c;
         sum2=c+sum2;
         System.out.println(sum2);
     }
     return sum2;
 }
 public static void main(String args[])
 {    
 overloadseries obj=new overloadseries();
 Scanner Sc=new Scanner (System.in);
 System.out.println("Enter 1 for sum series and 2 for fibonacci sum and any other number to exit");
 int ch=Sc.nextInt();
 switch(ch)
 {
     case 1:
         System.out.println("Enter 2 numbers");
         double aa=Sc.nextDouble();
         double nn=Sc.nextDouble();
         double z=obj.series(aa,nn);
         System.out.println("Sum series is "+z);
         break;
         case 2:
             System.out.println("Enter a number");
             double no=Sc.nextDouble();
             double y=obj.series(no);
 }
 }
}









