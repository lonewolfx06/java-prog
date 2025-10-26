import java.io.*;
public class OI
{
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader("names.txt");
        BufferedReader buf=new BufferedReader(fr);
        String text;
        int i=0;
        while((text=buf.readLine())!=null)
        {
            i++;
            System.out.println("names "+i+" ");
            System.out.println(text);
        }
        buf.close();
    }
}