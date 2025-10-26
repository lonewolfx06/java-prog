import java.util.*;
class max_min
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE SIZE OF ARRAY");
      int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0,min=0;
        for(int j=0;j<n;j++)
        {
            if (arr[j]>max)
            {
                max=arr[j];
            }
            else 
            if(arr[j]<min)
            {
                min=arr[j];
            }
        }
         System.out.println("MAXIMUN NUMBER IS"+max);
          System.out.println("MINIMUN NUMBER IS"+min);
  }
}