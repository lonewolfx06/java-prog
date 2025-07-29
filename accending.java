import java.util.*;
class accending
{
  public static void main(String args[])
  {
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the number of no you will enter ");
      int n=Sc.nextInt();
      int arr[]=new int[n];
      int temp=0;
      System.out.println("Enter the numbers");
      
        for(int j=0;j<n;j++)
        {
           arr[j]=Sc.nextInt();   
        }
      for(int i=0;i<n;i++)
      {
          for(int k=0;k<n-1;k++)
          {
              if(arr[k]>arr[k+1])
              {
              temp=arr[k];
              arr[k]=arr[k+1];
              arr[k+1]=temp;
          }
        }
      }
                for(int l=0;l<n;l++)
           {
              System.out.println(arr[l]);
           }
  }
}