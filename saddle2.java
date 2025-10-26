import java.util.*;
class saddle2
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int m=Sc.nextInt();
        int n=Sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                while(arr[i][j]>arr[i][j+1])
                {
                    int t=arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                System.out.print(arr[i][j]);
            }
               System.out.println("");
        }
    }
}