import java.util.*;
class bubble_sort
{
    static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int temp=0;
        int arr[]=new int[n];
        for(int a=0;a<n;a++)
        {
            arr[a]=Sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                int k=0;
                if(arr[j]>arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;;
                }
        }
    }
    for(int b=0;b<n;b++)
    {
    System.out.println(arr[b]+" ");
    }
  }
}