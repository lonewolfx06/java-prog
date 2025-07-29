import java.io.InputStreamReader;
import java.io.*;
class bufferreader
{
    public static void main (String args[])throws IOException
    {
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
      System.out.println("Enter a number");
      int no=Integer.parseInt(buf.readLine());
      System.out.println("Number is "+no);
    }
}