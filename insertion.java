import java.util.*;
class insertion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int n=Sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            ar[i]=Sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key)
            {
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
}