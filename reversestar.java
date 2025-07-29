 import java.util.*; 
class reversestar
{
  public static void main (String args[])
  {
      Scanner Sc=new Scanner(System.in);
      for (int r=1;r<=10;r++) 
      {
          for (int c=10;c>=r;--c)
          {
              System.out.print("*");
            }
            System.out.println(" ");
      }
  }
}