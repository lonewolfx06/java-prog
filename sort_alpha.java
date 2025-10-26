// a class sort_alpha has been defined to sort the words in the sentencein alphabetical order for eg "the sky is blue" will give "blue is sky the"
// some of the members of the class are given below
// DATA MEMBERS "Sent - to store a sentence" Integer to store the number of word in the sentence", sort_alpha(default cons) void acceptsent()- to accept the sentence in uppercase
//void sort(sort_aplha P)-stores the words of sentence of obj P in alphabetical value and store the sorted sentences and 
//void dsplay()-displays the original sentence along with sorted sentence by invoking the method sort.
import java.util.*;
class sort_alpha
{
    int integer;
    String sent;
    sort_alpha()
    {
        integer=0;
        sent="";
    }
    void acceptsent()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        sent=Sc.nextLine();
        sent=sent.toUpperCase();
    }
    void sort(sort_alpha P)
    {
     String arr[]=P.sent.split(" ");
     integer=arr.length;
      for(int i=0;i<integer-1;i++)
      {
          for(int j=0;j<integer-1;j++)
      {
            if(arr[j].compareTo(arr[j+1])>0)
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
 void display()
   {
  System.out.println("\n"+sent);
  }
 public static void main(String args[])
 {
     sort_alpha ob=new sort_alpha();
     sort_alpha obj=new sort_alpha();
     ob.acceptsent();
     ob.sort(ob);
     obj.display();
     ob.display();
 }
}
