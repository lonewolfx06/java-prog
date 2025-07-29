 import java.util.*;
class ifelse
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter cost of your item:");
        int cost=Sc.nextInt();
        float dis;
        if(cost<=200)
        {    
        dis=cost*5/100;
        System.out.println("Discount is "+dis);
    }
    else
    if(cost>=2001 && cost<=5000)
    {
        dis=cost*25/100;
        System.out.println("Discount is of "+dis);
    }
    else
    if(cost>+5001 && cost <=10000)
    {        dis=cost*35/100;
        System.out.println("Discount is "+dis);
    }
    else
    if(cost>10000)
    {
        dis=cost*50/100;
        System.out.println("Discount is "+dis);  
    }
  }
}