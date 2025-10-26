import java.util.*;
class para
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String n=Sc.nextLine();
        String arr[]=n.split("[-*$#?,..!/:();]");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}