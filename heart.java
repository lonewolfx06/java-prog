import java.util.*;
class heart
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((j==n/4)||(j==(n/4)+1) ||(j==(3*n)/4)|| (j==((3*n)/4) ||(j==(n/2) && i==n/4) ||((j==(n/2)+1) && i==n/4)))
                {
                    
                }
            }
        }
        for(int i=n;i>=1;i--)
     {
        for(int s=i;s<=n;s++)
        {
             System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
     } 
    }
}