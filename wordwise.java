import java.util.*;
class wordwise
{
    String str;
    String nrr[];
    wordwise()
    {}
    void readsent()
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();
        String nrr[]=str.split(" ");
        int l=nrr.length;
        for(int i=0;i<l;i++)
        {
            String a=nrr[i];
            int n=freq_vowel(a);
        }
    }
    static int s=0;int i=0;
    int freq_vowel(String w)
    {
        
        if(i<w.length())
        {
            if(w.charAt(i)=='a' ||w.charAt(i)=='A' ||w.charAt(i)=='e' || w.charAt(i)=='E' ||w.charAt(i)=='i' || w.charAt(i)=='I' || w.charAt(i)=='o' || w.charAt(i)=='O' || w.charAt(i)=='u'|| w.charAt(i)=='U')
            {
                i=i+1;
                s=s+1;
                freq_vowel(w);
            }
            else
            i++;
            freq_vowel(w);
        }
        return s;
    }
    void arrange()
    {
      System.out.println(str);
      for(int i=0;i<nrr.length;i++)
      {
      System.out.println(nrr[i]+" "+s);
      }
    }
    public static void main(String args[])
    {
        wordwise ob=new wordwise();
        ob.readsent();
        ob.arrange();
    }
}