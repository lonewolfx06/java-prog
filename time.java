import java.util.*;
class time
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner (System.in);
        int h=Sc.nextInt();
        int m=Sc.nextInt();
        int min[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};
        String smin[]={" ","one","two","three","four","five","six","seven","eigth","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty fife","twenty six","twenty seven","twenty eight","twenty nine"};
        int hr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        String shr[]={" ","one","two","three","four","five","six","seven","eigth","nine","ten","eleven","twelve"};
        if(h>12 || m>59)
        {
        System.out.println("Invalid input");
        System.exit(0);
       }
       int a=0;
        if(m>30)
        {
            if(m==45)
            {
                System.out.println("Quater past "+shr[h]);
                System.exit(0);
            }
            a=60-m;
            if(h<12)
            System.out.println(smin[a]+" left to "+shr[h+1]); 
            else
             System.out.println(smin[a]+" left to one");
        }
        else
        if(m<30 && m>0)
        {
            System.out.println(smin[m]+" past "+shr[h]);
        }
        else
        if(m==30)
        {
            System.out.println("Half past "+shr[h]);
        }
        else if(m==0)
        {
            System.out.println(shr[h]+" O'clock");
        }
    }
}