import java.util.*;
class selection
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=Sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int a=0;a<n;a++)
        {
            arr[a]=Sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            if(arr[j]>=arr[j+1])
            {
                int em=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=em;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
}