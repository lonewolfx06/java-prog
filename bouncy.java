import java.util.*;
class bouncy
{
   public static void main (String args[])
   {
       Scanner sc=new Scanner (System.in);
       System.out .println("Enter the number");
       int n=sc.nextInt();
       int no=n;
       int c=0;
       while(no>0)
       {
           c=c+1;
           no=no/10;
       }
       int arr[]=new int[c];
       int na=n;
       for(int a=0;a<c;a++)
       {
         arr[a]=na%10;
         na=na/10;
       }
       int q=0,p=0;
       for(int i=0;i<c-1;i++)
       {
           if(arr[i]>arr[i+1])
           p=p+1;
       }
       for(int j=0;j<c-1;j++)
       {
           if(arr[j]<arr[j+1])
           q=q+1;
       }
       if( q==c-1)
       System.out.println("It is a decending bouncy number");
       else if(p==c-1 )
       System.out.println("It is a accending bouncy number");
       else
       System.out.println("It is not a bouncy number");
   }
}