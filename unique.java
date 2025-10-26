import java.util.*;
class unique 
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int m=Sc.nextInt();
        
        int n=Sc.nextInt();
        if(n<m)
        {
            System.exit(0);
        }
        int count;
        int no=0,mo=0;
        for(int i=m;i<=n;i++)
        {
            mo=0;
            int co=m;
            count=0;
            String mn=Integer.toString(i);
            while(co>0)
            {
                co=co/10;
                count++;
            }
            System.out.print(i+"    ");
            for(int j=0;j<count-1;j++)
            {
                if(mn.charAt(j)==mn.charAt(j+1))
                {
                    mo=mo+1;
                    System.out.println(mo);
                }
            }
            if(mo==0)
            no=no+1;
        }
        System.out.println("");
        System.out.println(no);
    }
}