import java.util.*;;
class array
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int no=n;
        System.out.println("ENTER MARKS OF SUBJECTS");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int avg=0,sum=0;
        for(int j=0;j<n;j++)
        {
          sum=sum+arr[j];
        }
         avg=sum/n;
         System.out.println(avg);
    }
}