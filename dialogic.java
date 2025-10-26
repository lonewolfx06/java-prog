import java.util.*;
class dialogic
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        int n=Sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Sc.nextInt();
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int ls=0,rs=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                ls=arr[i][j]+ls;
                if(n-i-1==j)
                rs=rs+arr[i][j];
            }
        }
            System.out.println("Sum of left diagonal is "+ls);
            System.out.println("Sum of right diagonal is "+rs);
       }
}  
    