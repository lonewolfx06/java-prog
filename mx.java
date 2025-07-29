import java.util.*;
class mx
{
    static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int s=Sc.nextInt();
        int n=0,m=0;
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for(int j=0;j<s;j++)
        {
            int k=1;
            if(arr[j]<=arr[k])
            {
                n=arr[j];
            }
            if(arr[j]>=arr[k])
            m=arr[j];
        }
        System.out.println(n);
           System.out.println(m);
    }
}