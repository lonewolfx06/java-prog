import java.util.*;
class carton
{
    static int jj,kk,mm,ll;
    public static void main(String args[])
    {
        carton obj= new carton();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes");
        int n=Sc.nextInt();
        System.out.println("Number of boxes --- "+n);
        int a=48,b=24,c=12,d=6;
        int sum48=0,sum24=0,sum12=0,sum06=0;
        for(int i=1;i<2;i++)
        {
        if(n>1000)
        {
            System.out.println("INVALID INPUT");
            break;
        }
        else{
            for(jj=0;jj<=n;jj++)
            {
                if(a*jj<=n)
                {
                continue;
            }
                else
                {
                sum48=a*(jj-1);
                break;
            }    
          }
          n=n-sum48;
          for(kk=0;kk<=n;kk++)
          {
              if(b*kk<=n)
              {
                continue;
              }
              else
              {
                  sum24=b*(kk-1);
                  break;
              }
          }
          n=n-sum24;
          for(ll=0;ll<=n;ll++)
          {
              if(c*ll<=n)
              {
                  continue;
                }
              else
              {
                  sum12=c*(ll-1);
                  break;
              }
          }
          n=n-sum12;
          for(mm=0;mm<=n;mm++)
          {
              if(d*mm<=n)
              {
                  continue;
                }
                else
                {
                    sum06=d*(mm-1);
                    break;
                }
          }
          int jjj=jj-1,kkk=kk-1,lll=ll-1,mmm=mm-1;
          n=n-sum06;
          int carno=(jj-1)+(kk-1)+(ll-1)+(mm-1);
          System.out.println("The number of 48 size carton = "+jjj);
          System.out.println("The number of 24 size carton = "+kkk);
          System.out.println("The number of 12 size carton = "+lll);
          System.out.println("The number of 06 size carton = "+mmm);
          System.out.println("The number of boxes left = "+n);
          System.out.println("The number of cartons used = "+carno);
        
        }
    }
  }
}
