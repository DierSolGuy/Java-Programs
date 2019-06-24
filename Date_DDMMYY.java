/**
* The class Date_DDMMYY inputs a Date in ddmmyyyy 8-digit format and prints it in dd/mm/yyyy format
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.io.*;
class Date_DDMMYY
{  
    public static void main(String args[])throws IOException
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l, y, d, m;
        String dd, mm, yy;
 
        //array storing the maximum days of every month
        int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
 
        //array storing the month names
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", "December" };
 
        System.out.print("Enter any date in 8 digits (ddmmyyyy) format: ");
        String date = br.readLine(); //inputting the date in String format
 
        l = date.length(); //finding number of digits in the given input
 
        if(l==8) //performing the task only when number of digits is 8
        {
            dd = date.substring(0,2); //extracting the day in String format
            mm = date.substring(2,4); //extracting the month in String format
            yy = date.substring(4); //extracting the year in String format
            d = Integer.parseInt(dd); //day in Integer format
            m = Integer.parseInt(mm); //month in Integer format
            y = Integer.parseInt(yy); //year in Integer format
 
            if((y%400==0) || ((y%100!=0)&&(y%4==0))) // condition for leap year
            {
                maxdays[2]=29;
            }
             
            /* checking whether the day, month and year are within acceptable range
               i.e. there cannot be an input like 35012013 because 35/01/2013 is unacceptable*/
 
            if(m<0 || m>12 || d<0 || d>maxdays[m] || y<0 || y>9999) // Performing Date Validation
            {
            System.out.println("The day, month or year are outside acceptable limit");
            }
 
            else
            {
                /* First Part */
                System.out.println("Date in dd/mm/yyyy format = "+dd+"/"+mm+"/"+yy);
                              
                /* Second Part */
                System.out.print("Date in dd, month name, yyyy format = "+dd+" "+month[m]+", "+yy);
            }
        }
 
        else
            System.out.println("Wrong Input");
    }
}


