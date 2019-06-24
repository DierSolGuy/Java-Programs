/**
* The class Date_DayMethod1 finds the weekday name of a given date
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.io.*;
class Date_DayMethod1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String days[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.print("Enter the day : ");
        int d=Integer.parseInt(br.readLine());
        System.out.print("Enter the month : ");
        int m=Integer.parseInt(br.readLine());
        System.out.print("Enter the year : ");
        int y=Integer.parseInt(br.readLine());
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        {
            month[2]=29;
        }
        if(m<0 || m>12 || d<0 || d>month[m] || y<0 || y>9999) // Performing Date Validation
        {
            System.out.println("Invalid Date");
        }
        else
        {
            int dn=0;
            for(int i=1;i<m;i++)
            {
                dn=dn+month[i];
            }
            dn=dn+d;
 
            System.out.print("Enter the Day on 1st January in this year: ");
            String s=br.readLine().trim();
             
            //finding the day of the week which corresponds to the given day name
            int x=0;
            for(int i=1;i<=7;i++)
            {
                if (s.equalsIgnoreCase(days[i]))
                x=i;
            }
 
            // the main calculation of finding the name of the day of the week of the given date starts here
            for(int i=1;i<dn;i++)
            {
                x++;
                if(x==8)
                x=1;
            }
            System.out.print("Output : "+d+"/"+m+"/"+y+" is a "+days[x]);
        }
    }
}

