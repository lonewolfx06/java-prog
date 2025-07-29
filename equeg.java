 import java.io.*;
class equeg
{
    public static void main (String args[])throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 to know square of any no and 2 for square root");
        int i=Integer.parseInt(buf.readLine());
        if(i==2)
        {
        System.out.println("Enter the number whom you want to know square root ");
        int a=Integer.parseInt(buf.readLine());
        double k=Math.sqrt(a);
        System.out.println(k);
    }
    else
    if(i==1)
    {
        System.out.println("Enter the number whom you want to know square");
        int b=Integer.parseInt(buf.readLine());
        double l=(int)Math.pow(b,2);
        System.out.println(l);
    }
    else{
        System.out.println("Enter the number B/W 1 and 2");
    }
  }
}