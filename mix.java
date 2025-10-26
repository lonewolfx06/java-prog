//a class mix has been defined to mix to words character by character in the following manner ,the first character is followed by the first char. of second word and so on if the words are of different lenght the remaining charcter of the longer word put at the 
//for eg if the first is jump and second word is stroll and word will jsumptroll,and class name mix,WRD-to store the word,lenght -to store the lenght,memeber function MIXC1-default constructor to initial the data member with legal initial value
//void feedword-to accept in uppercase ,void MIXc1,MIXA
import java.util.*;
class mix
{
     int l;
     String wrd;
    mix()
    {
        l=0;
        wrd="";
    }
    void feedword()
    {
      Scanner Sc=new Scanner (System.in);
      System.out.println("Enter a word");
      wrd=Sc.nextLine();
    }
    void mix_word(mix P, mix Q)
    { 
        if(P.wrd.length()>=Q.wrd.length())
        {
        for(int i=0;i<Q.wrd.length();i++)
        {
         char c=P.wrd.charAt(i);
         char ch=Q.wrd.charAt(i);
         wrd=wrd+c+ch;
        }
      }
      else
      if(Q.wrd.length()>=P.wrd.length())
      {
        for(int i=0;i<P.wrd.length();i++)
        {
         char c=P.wrd.charAt(i);
         char ch=Q.wrd.charAt(i);
         wrd=wrd+c+ch;
        }
      }
    }
    void display()
    {
        System.out.print(wrd);
    }
    public static void main(String args[])
    {
      mix obj1=new mix();
      mix obj2=new mix();
      mix obj3=new mix();
      obj1.feedword();
      obj2.feedword();
      obj3.mix_word(obj1,obj2);
      obj3.display();
    }
}