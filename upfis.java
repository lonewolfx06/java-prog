import java.util.*;
class upfis
{
    public static void main(String args[])
    {
      Scanner Sc=new Scanner (System.in);
      System.out.println("Enter a sentence");
      String c=Sc.nextLine();
      c=" "+c;
      int l=c.length();
      String f="";
      for(int i=0;i<l;i++)
      {
          char ch=c.charAt(i);
          if(ch==' ')
          {
              f=f+ch;
              i=i+1;
              ch=c.charAt(i);
              f=f+Character.toUpperCase(ch);
          }
          else
          {
              f=f+ch;
          }
      }
      f=f.trim();
       System.out.println(f);
    }
}