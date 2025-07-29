import java.util.*;
class binary_search
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
      int key=Sc.nextInt();
      int s=0,e=n-1,pos=-1;
      while(s<=e)
      {
          int mid=(s+e)/2;
          if(arr[mid]==key)
          {
              pos=mid+1;
              break;
          }
          else
          if(arr[mid]<key)
          {
          s=mid+1;
          }
          else
          {
           e=mid-1;   
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
