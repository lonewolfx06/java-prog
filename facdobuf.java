import java.io.*;
class facdobuf
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a no");
        int a=Integer.parseInt(buf.readLine());
        int i=1,f=1;
        do
        {
         f=f*i;
         i++;
        }
        while(i<=a);
        System.out.println("Factorial of entered no "+a+" is "+f);
    }
}