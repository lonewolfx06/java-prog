import java.util.*;
class bookfair
{
    String bname;
    double price,dis,tamt;
    void input()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the name of the book");
        bname=Sc.nextLine();
        System.out.println("Enter the amount of book");
        price=Sc.nextDouble();
    }
    void calculate()
    {
        if (price<=1000)
        {
            dis=price*2/100;
            tamt=price-dis;
        }
        else
        if(price>1000 && price>=3000)
        {
            dis=price*10/100;
            tamt=price-dis;
        }
        else
        {
            dis=price*15/100;
            tamt=price-dis;
        }
    }
    void display()
    {
        System.out.println("Book name  "+bname);
        System.out.println("Price  "+price);
        System.out.println("Discount  "+dis);
        System.out.println("Update price  "+tamt);
    }
    public static void main (String args[])
    {
        bookfair obj=new bookfair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}