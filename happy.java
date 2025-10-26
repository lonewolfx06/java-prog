// a happy number is a number in which the sum of the square  of the digits of the number is equal to 1
// for eg 28 is  happy number, 12 is not a happy no.
// sum of the members functions of the class are al follows
//class name-happy
// n-store the no;
// members functions-happy(constructor to assin 0 to n, void getnum(int nn---to assign the parametre value to the number n=nn)
// sum_squaredigits(int x)--returns the sum of the squareof the digits of the no x;
// void is happy--- checks if the given no is a happy no by calling the function sum square digit and displays an appropriate message
import java.util.*;
class happy
{
    int n;
    static int sum=0;
    happy()
    {
     n=0;    
    }
    void getnum(int nn)
    {
      n=nn;
    }
    static int sum_square_digit(int x)
    {
        int rem=0;
        if(x>0)
        {
           rem=x%10;
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
        happy obj=new happy();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=Sc.nextInt();
        obj.getnum(a);
        obj.ishappy();
    }
    }
