import java.util.*;
class boun
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n=Sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Sc.nextInt();
            }
        }
        int c=0,r=0;
        int sum=0;
            while(r==0 && c<n)
            {
                sum=sum+arr[r][c];
                c++;
        }
        c=0;
        while(c==0 && r<n)
       {
           sum=sum+arr[r][c];
           r++;
       }
               r=n-1;
                while(r==n-1 && c<n)
       {
           sum=sum+arr[r][c];
           c++;
        }
        c=n-1;
               while(c==n-1 && r<n)
       {
           sum=sum+arr[r][c];
           r++;
        }

               for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {
         System.out.print(" "+arr[i][j]);
       }
       System.out.println(" ");
       }
       System.out.println("Sum is "+sum);
   }
}
