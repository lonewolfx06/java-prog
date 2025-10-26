// WAP to declare a square matrix 'A' a of order n where n should be less than 20. allow the user to input positive integers into this matrix perform the following task on the matrix
//1) output he original matrix;  2) find the saddle point for the matrix(a saddle point is an element such the it is the min to the row to which it belong and the max element for the column to
// which it belongs, saddle point for the given matrix is always unique. if the matrix has no saddle point output the message no saddle point
//3) sort the elements along principal diagonal in ascending orderusing any sort technique. all other elements should remain unchanged.
// Sample data - n=4;
// 1 2 3      4 16 12
// 4 5 8      2  8 14
// 7 8 9      1  3  6
//after sorting  2
import java.util.*;
class saddle
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int l=-1,k=-1;
        int arr[][]=new int [n][n];
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
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
        int ab=0,ba=0;
        int a=0;
        for(int i=0;i<n;i++)
        {   
            a=0;
            ba=0;
            while(arr[i][ab]>=arr[a][ab])
            {
                a++;
                ba++;
            }
            if(ba==n-1)
            {
                l=i;
                break;
            }
            if(ab==n-1)
            {
                ab=0;
            }
            else
            {
                ab++;
                i=-1;
            }
        }
         for(int i=0;i<n;i++)
        {   
            a=0;
            ba=0;
            while(arr[ab][i]>=arr[a][i])
            {
                a++;
                ba++;
            }
            if(ba==n-1)
            {
                k=i;
                break;
            }
            if(ab==n-1)
            {
                ab=0;
            }
            else
            {
                ab++;
                i=-1;
            }
        }
             if(l==-1 || k==-1)
        {
            System.out.println("NO Saddle point");
        }
        else
        System.out.println("Saddle point is "+arr[l][k]);       
    }
}
