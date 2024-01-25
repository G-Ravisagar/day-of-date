import java.util.;
public class day
{
    static Scanner sc=new Scanner(System.in);
    static int day(int day)
    {
        return day%7;
    }
    static int month(String month)
    {
        String m=month;
        int x=0;
        if(m.length()!=0)
        {
        if(m.equals( 1)  m .equals(01)  m .equals(january))
           x= 0;
        else if(m .equals(2 ) m .equals(02 ) m .equals(february))
            x= 3;
        else if(m .equals(3 ) m .equals(03 ) m .equals(march))
               x= 3;
        else if(m .equals(4)  m .equals(04)  m .equals(april))
               x= 6;
        else if(m .equals(5)  m .equals(05)  m .equals(may))
               x= 8;
        else if(m .equals(6) m .equals(06)  m .equals(june))
               x= 11;
        else if(m .equals(7) m .equals(07 ) m .equals(july))
               x= 13;
        else if(m .equals(8)  m .equals(08)  m .equals(august))
               x= 16;
        else if(m .equals(9)  m .equals(09 ) m .equals(september))
               x= 19;
        else if(m .equals(10)  m .equals(10 ) m .equals(october))
               x= 21;
        else if(m .equals(11 )  m .equals(november))
               x= 24;
        else if(m .equals(12)  m .equals(december))
               x= 26; 
        }
        return x;  
    }
    static int year(int year)
    {
        int x=0;
        int y=year+1,c=0;
        if((y%400)%4==0)
        {
            System.out.println(leap);
            c=1;
        }
        int h=year%400;
        int t=h100;
        int t1=h%100;
        int o=t1+(t14);
        if(t==1)
            x=5;
        else if(t==2)
            x=3;
        else if(t==3)
            x=1;
        else
            x=0;
        return (x+o+c)%7;
    }
    public static void main(String []args)
    {
        int t=0;
        System.out.println(enter your day);
        int day=sc.nextInt();
        System.out.println(enter your month);
        String month=sc.next().toLowerCase();
        System.out.println(enter your year);
        int year=sc.nextInt();
        int day1=day(day);
        int month1=month(month);
        int year1=year(year-1);
        int y=year,c=0;
        if((y%400)%4==0)
        {
            c=1;
        }
        if(c==1 && month.equals(1) month.equals(01)month.equals(january)month.equals(2) month.equals(02)month.equals(february)) 
            t=-1;
        t=(t+(day1+month1+year1))%7;
        System.out.println(day1+ +month1+  +year1);
        if(t==0)
            System.out.println(sunDay);
        else if(t==1)
            System.out.println(MonDay);
        else if(t==2)
            System.out.println(TuesDay);
        else if(t==3)
            System.out.println(WednesDay);
        else if(t==4)
            System.out.println(ThursDay);
        else if(t==5)
            System.out.println(FriDay);
        else 
            System.out.println(SaturDay);        
    }
}
