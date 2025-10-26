// a class sort aplha has been defined to sort the words in the sentence in alphabetical order example the sky is blue output blue is sky the 
// class sortalpha;datamembers to storeasentence
//n intereger (to store the number of words in a sentence)|| default constructor|| void acceptsent(to accept a setence in uppercase)|| void sort(sortalphaP)[storesthesortedsentencein current object]
// void display(displays the original sentence along with the sorted sentence by invoking the method sort)
import java.util.*;
class sortalpha
{
     static String n;
     static String sent;
     static String arr[]; 
      static int integer;
    sortalpha()
    {
        sent="";
        n="";
        integer=0;
    }
    void sort(sortalpha P)
    {
         String arr[]=P.n.split(" ");
        integer=arr.length;
        String t="";
        for(int i=0;i<integer-1;i++)
      {
            for(int j=0;j<integer-1;j++)
        {
            if(arr[j].substring(0).compareTo(arr[j+1].substring(0))>0)
            {
                String em=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=em;
            }
         }
       }
      for(int a=0;a<integer;a++)
      {
      sent=sent+arr[a]+" ";
      }   
    }
    void acceptsent()
    {
         Scanner Sc=new Scanner(System.in);
        n=Sc.nextLine();
        n=n.toUpperCase();
    }
    void display()
    {
        System.out.println(sent);
        System.out.println(" number of words: "+integer);
    }
    public static void main(String args[])
    {
        sortalpha obj=new sortalpha();
        sortalpha ob=new sortalpha();
        obj.acceptsent();
        obj.sort(ob);
        obj.display();
    }
}
