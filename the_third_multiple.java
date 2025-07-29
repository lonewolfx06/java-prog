import java.util.*;
class the_third_multiple
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=Sc.nextInt();
        int arr[]=new int[s];
        
        for(int i=0;i<s;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for(int j=0;j<s;j++)
        {
            if(arr[j]%7==0)
            {
                int m=arr[j]*3;
                System.out.println("3rd multiple of number "+arr[j]+" entered by you is "+m);
            }
        }
    }
}