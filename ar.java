import java.util.*;
class ar
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=Sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of array");
        for(int a=0;a<n;a++)
        {
            for(int b=0;b<n;b++)
            {
                arr[a][b]=Sc.nextInt();
            }
        }
         for(int a=0;a<n;a++)
        {
            for(int b=0;b<n;n++)
            {
                System.out.print(arr[a][b]);
            }
            System.out.println(" ");
        }
        int mn=Sc.nextInt();
        int nm=Sc.nextInt();
        System.out.println(arr[mn][nm]);
    }
}
