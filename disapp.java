import java.util.*;
class disapp
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
                System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+arr[j][i]);
            }
            System.out.println(" ");
        }
    }
}