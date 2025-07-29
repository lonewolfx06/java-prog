 import java.util.*;
class starsand123 
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
         for(int k=1;k<=5;k++)
         {
             for(int l=5;l>=k;l--)
             {
                 System.out.print("*");
             }
             System.out.println(" ");
         }
        }
    }