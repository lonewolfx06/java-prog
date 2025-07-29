// a cloth showroom has announced a following festival discount on the purchase of items based on the total cost of the items purchased
// if less than 2000   dis 5, 2001 to 5000 dis 25, 5001 to 10000 dis 35, 10000 or more dis 50
import java.util.*;
class showroomdiscount
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter your amount");
        int amt=Sc.nextInt();
        double dis;
        if(amt<=2000)
        {
            dis=amt*5/100;
            System.out.println("You will get "+dis+ " discount");
        }
        else 
        if(amt>=2001 && amt<=5000)
        {
            dis=amt*25/100;
            System.out.println("You will get "+dis+ " discount");
        }
        else
        if(amt>=5001 && amt<10000)
        {
         dis=amt*35/100;
        System.out.println("You will get "+dis+ " discount");
        }
        else 
        {
            dis=amt*50/100;
            System.out.println("You will get "+dis+ " discount");
        }
    }
}
    
