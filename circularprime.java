// a circular pime is a prime number that remians prime under cyclic shiftof its digits. when the left most digit is removed and replaced at the end of the remaining string of digits the generated is
//still prime the process repeats until the original number is reached aagain for eg131->113->311 hence 131 is a circular prime number
//test your program with the following data eg1 inpurt n=197yes eg 2 1193yes eg 3 29no
import java.util.*;
class circularprime
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        int num=n;
        int count=0;
        while(num>0)
        {
            count=count+1;
            num=num/10;
        }
        System.out.println("count is "+count);
        int arr[]=new int[count];
        int p=0;
           for(int i=0;i<count;i++)
           {
               arr[i]=n;
                int s=arr[i]/(int)Math.pow(10,count-1);
                int rem=arr[i]%(int)Math.pow(10,count-1)*10+s;
                n=rem;
           }
           for(int i=0;i<count;i++)
           {
            int no=arr[i];
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    System.out.println(arr[i]+" is not prime");
                    p=p+1;
                }             
            }
             System.out.println(arr[i]+" is a prime number");
           }
           if(p==0)
           System.out.println("It is a circular prime number");
           else
           System.out.println("It is not a circular prime number");
        }
}
