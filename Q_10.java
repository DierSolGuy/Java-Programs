/**
*The class Q_10_ISC_2008 accepts a date & display the corresponding date and also display the future date. 
*Program No. on project sheet:179
*Page No. on project sheet: 384-385
 * @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2008. 
*/



import java.util.*;
class Q_10
{

    public static void calculation(int y,int d1)
    {
            int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
            String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
            if(y%4==0 )
            {
                d[1]=29;
                if(y%4==0 && d1>366)
                System.out.println("Invalid ");
                else if(y%4!=0 && d1>365)
                System.out.println("Invalid ");
                else
                {
                    int i=0;
                    while(d1>0)
                    {
                        d1=d1-d[i];
                        i=i+1;
                    }
                    if(d1<=0)
                    {   
                        d1=d[i-1]+d1;
                    }
                    if(d1==1)
                    System.out.println("date is: "+d1+"st"+" "+month[i-1]+" "+y);
                    if(d1==2)
                    System.out.println("date is: "+d1+"nd"+" "+month[i-1]+" "+y);
                    if(d1==3)
                    System.out.println("date is: "+d1+"rd"+" "+month[i-1]+" "+y);
                    else
                    System.out.println("date is: "+d1+"th"+" "+month[i-1]+" "+y);
                }
            }
            if(y%4!=0 )
            {
               
                if(y%4==0 && d1>366)
                System.out.println("Invalid ");
                else if(y%4!=0 && d1>365)
                System.out.println("Invalid ");
                else
                {
                    int i=0;
                    while(d1>0)
                    {
                        d1=d1-d[i];
                        i=i+1;
                    }
                    if(d1<=0)
                    {
                        d1=d[i-1]+d1;
                    }
                   if(d1==1)
                   System.out.println("date is: "+d1+"st"+" "+month[i-1]+" "+y);
                   if(d1==2)
                   System.out.println("date is: "+d1+"nd"+" "+month[i-1]+" "+y);
                   if(d1==3)
                   System.out.println("date is: "+d1+"rd"+" "+month[i-1]+" "+y);
                   else
                   System.out.println("date is: "+d1+"th"+" "+month[i-1]+" "+y);
                }
            }
    }
    public static void main()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println(" Enter day no: ");
            int day1=sc.nextInt();
            System.out.println("Enter year in four digit form: ");
            int year1=sc.nextInt();
            System.out.println("Enter date after");
            int x=sc.nextInt();
            int day2=day1+x;
            int year2=year1;
            if(year1%4==0 && day2>366)
            {
                year2=(year2+1);
                day2=day2-366;
            }
            if(year1%4 !=0 && day2 >365)
            {
                year2=(year2+1);
                day2=day2-365;
            }
            calculation(year1,day1);
            calculation(year2,day2);
        }
    }



