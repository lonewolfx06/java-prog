import java.util.*;
class tictactoe
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    for(int i=0;i<3;i++)
    {
            for(int j=0;j<3;j++)
        {
            arr[i][j]=Sc.nextInt();
        }
    }
                for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
        {
            System.out.print(" "+arr[i][j]);
        }
        System.out.println(" ");
    }
    int nm=Sc.nextInt();
    int mn=Sc.nextInt();
    System.out.println(arr[nm][mn]);
}
}