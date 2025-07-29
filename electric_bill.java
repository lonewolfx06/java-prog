import java.util.*;
class electric_bill
{
    Scanner Sc=new Scanner (System.in);
    String n;
    int units;
    double bill;
    void accept()// to input the details by the user
    {
        System.out.println("Enter your name");
        n=Sc.nextLine();
        System.out.println("Enter the number of units");
        units=Sc.nextInt();
    }
    void calculate()// to calculate the bill
    {
        if(units<=100)
        {
            bill=units*2.0;
        }
        else
        if(units>100 && units<=300)
        {
            bill=(2*100)+(units-100)*3;
        }
        else
        if(units>300)
        {
            bill=(2*100)+(3*200)+(units-300)*2;
            bill=bill*2.5;
        }
    }
    void display()// to display the values
    {
        System.out.println("Entered details are as follows");
        System.out.println("Name "+n);
        System.out.println("Units "+units);
        System.out.println("By entered details your bill is "+bill);
    }
    public static void main(String args[])// it is the main method
    {
        electric_bill obj=new electric_bill();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}