import java.util.*;
class sumseires
{
    static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=Sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            if(arr[j]%2==0)
            {
            sum=sum+arr[j];    
            }
            else
            continue;
        }
        System.out.println("Sum of all even numbers of array is "+sum);
    }
}