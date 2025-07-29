 import java.util.*;
class switchloop
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 1 for star,2 for reverse star,3 for 123 and 4 for 321");
        int ch=Sc.nextInt();
        switch(ch)
        {
            case 1:
            for(int a=1;a<=5;a++)
            {
                for(int b=1;b<=a;b++)
                {
                    System.out.print("*");
                }
                    System.out.println(" ");
            }
            break;
            case 2:
                for(int c=5;c>=1;c--)
                {
                    for(int d=1;d<=c;d++)
                    {
                        System.out.print("*");
                    }
                     System.out.println(" ");
            }
            break;
            case 3:
                   for(int i=1;i<=5;i++)
                   {
                       for(int j=1;j<=i;j++)
                       {
                           System.out.print(j);
                   }
                   System.out.println(" ");
            }
            break;
            case 4:
            for(int k=1;k<=5;k++)
            {
                for (int l=5;l>=k;l--)
                {
                 System.out.print(l);    
                }
                System.out.println(" ");
            }
            break;
            default:
                System.out.println("You are obliged to choose from only 1,2,3,4 hence wrong choice");
    }
 }
}