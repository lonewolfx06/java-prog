import java.io.*;
public class IO
{
    static String filename=("names.txt");//name of file
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader buf=new BufferedReader(isr);
    public static void main(String args[])throws IOException
    {
        FileWriter fw=new FileWriter(filename);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter OutFile=new PrintWriter(bw);
        System.out.println("Enter names of 5 people");
        String names="";
        for(int i=1;i<=5;i++)
        {
            names=buf.readLine();
            OutFile.println(names);
        }
        OutFile.close();
    }
}
    
