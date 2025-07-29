import java.util.*;
class fui
{
     static int isHappyNumber(int num)
     {  
         int rem=0,sum=0;    
        while(num > 0){  
            rem=num%10;  
            sum=sum+(rem*rem);  
            num=num/10;  
        }  
        return sum;  
    }
         public static void main(String[] args) 
        {  
        Scanner Sc=new Scanner (System.in);
        int num=Sc.nextInt();  
        int result=num;  
          
        while(result !=1 && result !=4){  
            result = isHappyNumber(result);  
        }  
          
        //Happy number always ends with 1  
        if(result == 1)  
            System.out.println(num + " is a happy number");  
        //Unhappy number ends in a cycle of repeating numbers which contains 4  
        else if(result == 4)  
            System.out.println(num + " is not a happy number");     
    }  
   }