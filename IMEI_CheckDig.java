/**
* The class IMEI_CheckDig inputs the first 14 digits of an IMEI number
* and finds the last check digit of the IMEI code


In algorithm form:

    Compute the sum of the digits (52 in this case).
    Multiply the sum by 9 (9*52 = 468).
    Divide the result by 10 and note down the remainder (468 % 10)
    The last digit, 8, is the check digit.


Program Type : BlueJ Program - Java
*/
 
import java.io.*;
class IMEI_CheckDig
{
    int sumDig(int n) // Function for finding and returning sum of digits of a number
    {
        int a = 0;
        while(n>0)
        {
            a = a + n%10;
            n = n/10;
        }
        return a;
    }
     
    public static void main(String args[])throws IOException
    {
        IMEI_CheckDig ob = new IMEI_CheckDig();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("Enter first 14 digits of IMEI code : ");
        long n = Long.parseLong(br.readLine()); // 14 digits cannot be stored in 'int' data type
         
        String s = Long.toString(n); // Converting the number into String for finding length
        int l = s.length();
         
        if(l!=14) // If length is not 14 then IMEI is Invalid
            System.out.println("Output : Invalid Input");
        else
        {
            int d = 0, sum = 0;
            for(int i=14; i>=1; i--)
            {
                d = (int)(n%10);
                 
                if(i%2 == 0)
                {
                    d = 2*d; // Doubling every alternate digit
                }
 
                sum = sum + ob.sumDig(d); // Finding sum of the digits
                 
                n = n/10;
            }
            System.out.println("Sum = "+sum);
 
            int dig = (9*sum)%10; // Finding the check digit
            System.out.println("Output : The check digit = "+dig);
             
        }
    }
}


