import java.util.*;
class linear
{
  public static void main(String args[])
  {
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the number of no you will enter ");
      int n=Sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the numbers");
      for(int i=0;i<n;i++)
      {
          arr[i]=Sc.nextInt();
      }
      System.out.println("Enter the search key");
      int pos=-1;
      int key=Sc.nextInt();
      for(int j=0;j<n;j++)
      {
          if(arr[j]==key)
          {
              pos=j+1;
              break;
          }
      }
         if(pos==-1)
        {
          System.out.println("Unsuccessful in searching "+key);
        }
      else
        System.out.println("Successfully found at index no "+pos);
      }
}