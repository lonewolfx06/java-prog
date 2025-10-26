// write a program to enter elements in double dimensional array and find entered matrix is sparse matrix or not a matrix is a saprse if it has non zero elements 
// less than 0 zero elements
import java.util.*;
class sparse
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        int n=Sc.nextInt();
        int arr[][]=new int[n][n];
        int osum=0,nsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Sc.nextInt();
            }
        }
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<n;b++)
            {
                if(arr[a][b]==0)
                {
                    osum=osum+1;
                }
                else
                nsum=nsum+1;
            }
        }
        if(osum>nsum)
        {
          System.out.println(" Siuuuuuu ");
        }
        else
        System.out.println("NO");
    }
}
