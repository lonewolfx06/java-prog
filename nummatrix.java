// WAP to enter matrix of n size from entered matrix search a particular number using only selection sort technique. 
//Also find how many time a number is appearing in the matrix.
import java.util.*;
class nummatrix
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search");
        int key=Sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             if(arr[i][j]==key)
             {
                 count=count+1;
             }
            }
        }
         for(int a=0;a<n;a++)
        {
            for(int b=0;b<n;b++)
            {
                System.out.print("  "+arr[a][b]);
            }
            System.out.println(" ");
        }
        if(count==0)
        {
            System.out.println("NOT FOUND");
        }
        else
        {
            System.out.println("SUIIIIII"+count);
        }
    }
}