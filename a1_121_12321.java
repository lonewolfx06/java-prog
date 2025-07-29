import java.util.*;
class a1_121_12321
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            int k=i;
            
            for(int l=1;l<k;l++)
                {
                    System.out.print(l);
                    k=k-1;
                }
            System.out.println(" ");
            }
        }
    }
