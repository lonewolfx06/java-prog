//WAP: Define a class called mobike wih the following discrption instance variable /data members
//int bno:to store bike number
//int phno:To store the phone no
// int days:to store the no of days the bike is taken on rent
// string name:to store the name of customer
//int charge: to store and calculate the rental charge
//memvber meathods
// void input(): to input and store the detail of the customer
//void compute():to calculate the charge
//The rent for a mobike is charged on the following basis
// 1st 5 days- ruppee 500 per day
// next 5 days- ruppee 400 per day
//rest of the days-ruppee 200 per day
//void display()-to display the details in the following format 
//format: bike no   Phone no     name     no of days     charge    
import java.util.*;
class mobike
{
    int bno,phno,days,charge;
    String name;
    Scanner Sc=new Scanner (System.in);
    void input()
    {
        System.out.println("Enter your name");
        name=Sc.nextLine();
        System.out.println("Enter the bike number");
        bno=Sc.nextInt();
        System.out.println("Enter last 4 numbers of your phone number");
        phno=Sc.nextInt();
        System.out.println("Enter your rental days");
        days=Sc.nextInt();
    }
    void compute()
    {
        if(days>=1 && days<=5)
        {
            charge=days*500;
        }
        else
        if(days>=6 && days<=10)
        {
            charge=(5*500)+(days-5)*400;
        }
        else
        {
            charge=(5*500)+(5*400)+(days-10)*200;
        }
    }
    void display()
    {
        System.out.println("Bike number"+"\t"+"Phone number"+"\t"+"Rental days"+"\t"+"Name"+"\t"+"Charge");
         System.out.println(bno+"\t"+phno+"\t"+days+"\t"+name+"\t"+charge);
    }
    public static void main(String args[])
    {
        mobike obj=new mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}
