import java.util.*;
class  scramble
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String worda1=Sc.nextLine();
        String word1=worda1.toLowerCase().trim();
        String worda2=Sc.nextLine();
        String word2=worda2.toLowerCase().trim();
        int le1=word1.length();
        int le2=word2.length();
        if(le1!=le2)
        System.exit(0);
        int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0,d1=0,d2=0,e1=0,e2=0,f1=0,f2=0,g1=0,g2=0,h1=0,h2=0,i1=0,i2=0,j1=0,j2=0,k1=0,k2=0,l1=0,l2=0,m1=0,n1=0,m2=0;
        int n2=0,o1=0,o2=0,p1=0,p2=0,q1=0,q2=0,r1=0,r2=0,s1=0,s2=0,t1=0,t2=0,u1=0,u2=0,v1=0,v2=0,w1=0,w2=0,x1=0,x2=0,y1=0,y2=0,z1=0,z2=0;
        for(int i=0;i<le1;i++)
        {
            if(word1.charAt(i)=='a')
            a1=a1+1;
            else if(word1.charAt(i)=='b')
            b1=b1+1;
            else if(word1.charAt(i)=='c')
            c1=c1+1;
            else if(word1.charAt(i)=='d')
            d1=d1+1;
            else if(word1.charAt(i)=='e')
            e1=e1+1;
            else  if(word1.charAt(i)=='f')
            f1=f1+1;
            else  if(word1.charAt(i)=='g')
            g1=g1+1;
            else   if(word1.charAt(i)=='h')
            h1=h1+1;
            else  if(word1.charAt(i)=='i')
            i1=i1+1;
            else  if(word1.charAt(i)=='j')
            j1=j1+1;
            else  if(word1.charAt(i)=='k')
            k1=k1+1;
            else  if(word1.charAt(i)=='l')
            l1=l1+1;
            else  if(word1.charAt(i)=='m')
            m1=m1+1;
            else   if(word1.charAt(i)=='n')
            n1=n1+1;
            else  if(word1.charAt(i)=='o')
            o1=o1+1;
            else if(word1.charAt(i)=='p')
            p1=p1+1;
            else if(word1.charAt(i)=='q')
            q1=q1+1;
            else if(word1.charAt(i)=='r')
            r1=r1+1;
            else if(word1.charAt(i)=='s')
            s1=s1+1;
            else if(word1.charAt(i)=='t')
            t1=t1+1;
            else if(word1.charAt(i)=='u')
            u1=u1+1;
            else if(word1.charAt(i)=='v')
            v1=v1+1;
            else if(word1.charAt(i)=='w')
            w1=w1+1;
            else if(word1.charAt(i)=='x')
            x1=x1+1;
            else if(word1.charAt(i)=='y')
            y1=y1+1;
            else
            z1=z1+1;
        }
         for(int i=0;i<le2;i++)
        {
            if(word2.charAt(i)=='a')
            a2=a2+1;
            else if(word2.charAt(i)=='b')
            b2=b2+1;
            else if(word2.charAt(i)=='c')
            c2=c2+1;
            else if(word2.charAt(i)=='d')
            d2=d2+1;
            else if(word2.charAt(i)=='e')
            e2=e2+1;
            else if(word2.charAt(i)=='f')
            f2=f2+1;
            else if(word2.charAt(i)=='g')
            g2=g2+1;
            else if(word2.charAt(i)=='h')
            h2=h2+1;
            else if(word2.charAt(i)=='i')
            i2=i2+1;
            else if(word2.charAt(i)=='j')
            j2=j2+1;
            else if(word2.charAt(i)=='k')
            k2=k2+1;
            else if(word2.charAt(i)=='l')
            l2=l2+1;
            else if(word2.charAt(i)=='m')
            m2=m2+1;
            else if(word2.charAt(i)=='n')
            n2=n2+1;
            else if(word2.charAt(i)=='o')
            o2=o2+1;
            else if(word2.charAt(i)=='p')
            p2=p2+1;
            else if(word2.charAt(i)=='q')
            q2=q2+1;
            else if(word2.charAt(i)=='r')
            r2=r2+1;
            else if(word2.charAt(i)=='s')
            s2=s2+1;
            else if(word2.charAt(i)=='t')
            t2=t2+1;
            else if(word2.charAt(i)=='u')
            u2=u2+1;
            else if(word2.charAt(i)=='v')
            v2=v2+1;
            else if(word2.charAt(i)=='w')
            w2=w2+1;
            else if(word2.charAt(i)=='x')
            x2=x2+1;
            else if(word2.charAt(i)=='y')
            y2=y2+1;
            else
            z2=z2+1;
        }
        if(a1==a2 && b1==b2 && c1==c2 && d1==d2 && e1==e2 && f1==f2 && g1==g2 && h1==h2 && i1==i2 && j1==j2 && k1==k2 && l1==l2 && m1==m2 && n1==n2 && o1==o2 && p1==p2 && q1==q1 && r1==r2 && t1==t2 && u1==u2 && v1==v2 && w1==w2 && x1==x2 && y1==y2 && z1==z2)
        System.out.println("ANAGRAM");
        else
        System.out.println("NOPE");
    }
}