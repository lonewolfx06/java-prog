// design a class convert to find the date and the month from a given day number for a particular year
//for eg if day no is 64 and the year is 2020 then the coresponding date would be march 4 2020ie31+29+4=64
//some of the members of he calss are given given below
// data member n=integer to ore the day no,d=inter=ger to store the day of the month,m=integer to sort the month,y=integer to store the year
//methhods-void accept(*to accept the day o and year),void daytodate(*day no to its day for a particlar yearand stores the date in d and m),void display(date month year)
import java.util.*;
class convert
{
    static int n=0;
    static int mno=0;
    static int y=0;
    static int a=0;
    static String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    void accept()
    {
        Scanner Sc=new Scanner(System.in);
         y=Sc.nextInt();
         if(y%4==0)
         {
        System.out.println("Enter the no bw 1 and less than or equal to 366"); 
        n=Sc.nextInt();
     }
     else
     {
         System.out.println("Enter the no bw 1 and less than or equal to 365"); 
        n=Sc.nextInt();
        
     }
       
    }
    void daytodate()
    {
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0)
        {
            arr[1]=arr[1]+1;
        }
        int i=0;
       while(n>31)
       {
           n=n-arr[i];
           i++;
           mno++;
       }
       a=n;
        }
        
        void display()
        {
            System.out.println("Date for number is "+a+" "+mon[mno]+" "+y);
        }
        public static void main(String args[])
        {
            convert obj=new convert();
            obj.accept();
            obj.daytodate();
            obj.display();
        }
    }