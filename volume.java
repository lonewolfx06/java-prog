import java.util.*;
class volume
{
    void cal(int side)
    {
        double a1=Math.pow(side,3);
        System.out.println((int)a1);
    }
    void cal(int le,int br,int he)
    {
        int a2=le*br*he;
        System.out.println(a2);
    }
    public static void main(String args[])
    {    
        volume obj=new volume();
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter 1 for cube and 2 for cuboid and anyhting else to stop the program");
    int ch=Sc.nextInt();
    if(ch==1)
    {
        System.out.println("Enter the side of cube");
        int s=Sc.nextInt();
        obj.cal(s);
    }
    else
    if(ch==2)
    {    
        System.out.println("Enter the length,breadth,height of cuboid respectively");
        int l=Sc.nextInt();
        int b=Sc.nextInt();
        int h=Sc.nextInt();
        obj.cal(l,b,h);
    }
    else
    {
     System.exit(0);
    } 
    }
}