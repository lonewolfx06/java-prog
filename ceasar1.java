import java.util.*;
class ceasar1
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter z to a sentence");
        String sen=Sc.nextLine();
        String n="";
        int a=0;
        char na;
        for(int i=0;i<sen.length();i++)
        {
            if((sen.charAt(i)>=65 && sen.charAt(i)<=77) ||(sen.charAt(i)>=97 && sen.charAt(i)<=109))
            {
                a=sen.charAt(i)+13;
                na=(char)a;
                String naa=Character.toString(na);
                n=n+na;
            }
            else
            if((sen.charAt(i)>77 && sen.charAt(i)<=91) ||(sen.charAt(i)>109 && sen.charAt(i)<=122))
            {
                a=sen.charAt(i)-13;
                na=(char)a;
                String naa=Character.toString(na);
                n=n+na;
            }
            else
            n=n+sen.charAt(i);
        }
        System.out.println(n);
    }
}