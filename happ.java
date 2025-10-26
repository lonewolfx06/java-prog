// a happy number is a number in which the evantual sum of the square of the digits of the number is qual to one for eg:- 28=2^2+8^2=68 || 6^2+8^2=36+64=100|| 1^2+0^2+0^2=1 
//hence 28 is a happy number 2) 12=1^2+2^2=1+4=5 hence no
// class name happy 
//data menmbers happy() constructor to assign 0 to n
// void getnum(int nn) to asign the parametre value to the number n=nn;
// int sum_sq_digits(int x) return the sum of the square of the digits of the number x using the recursive technique
// void ishappy() checks if the given no is a happy number by calling the fnction sum square digit and displays an appropriate messge 
// a happy number is a number in which the sum of the square  of the digits of the number is equal to 1
// for eg 28 is  happy number, 12 is not a happy no.
import java.util.*;
class happ
{
    int n;
    static int sum=0;
    happ()
    {
     n=0;    
    }
    void getnum(int nn)
    {
      n=nn;
    }
    static int sum_square_digit(int x)
    {
        if(x>0)
        {
           int rem=x%10;
            sum=sum+(rem*rem);
            x=x/10;
            sum_square_digit(x);
        }
        return sum;
    }
    void ishappy()
    {
        while(n>9)
        {
            sum=0;
            n=sum_square_digit(n);
        }
        if(n==1)
        System.out.println("It is a happy no "+n);
        else
        System.out.println("NO, it is not a happy number "+n);
    }
    public static void main(String args[])
    {
        happ obj=new happ();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=Sc.nextInt();
        obj.getnum(a);
        obj.ishappy();
    }
    }
