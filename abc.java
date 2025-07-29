import java.util.*;
class abc
{
    static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String arr[]={"India","Italy","Jordan","Brazil","China","Mexico","Peru"};
        String brr[]={"Taj Mahal","Colloseum","Petra","Statue of Christ Redemeer","Great wall of China","Chichen Itza Pyramid","Machu Pichu"};
        System.out.println("Enter the wonder and we will tell you where it is situated");
        String n=Sc.nextLine();
        for(int i=0;i<arr.length;i++)
        {
            if(n.equals(brr[i]))
            {
                System.out.println("the wonder "+brr[i]+" is situated at "+arr[i]);
            }
        }
    }
}