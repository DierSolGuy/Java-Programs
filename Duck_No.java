/**
* The class Duck_No inputs a number and checks whether it is a Duck Number or not
* Write a Program in Java to input a number and check whether it is a Duck Number or not.
Note: A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number.
 For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.

* @Program Type : BlueJ Program - Java
*/
 
import java.io.*;
class Duck_No
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n=br.readLine(); //inputting the number and storing it in a String
 
        int l=n.length(); //finding the length (number of digit) of the number
        int c=0; //variable for counting number of zero digits
        char ch;
 
        for(int i=1;i<l;i++)
        {
            ch=n.charAt(i); //extracting each digit and checking whether it is a '0' or not
            if(ch=='0')
                c++;
        }
 
        char f=n.charAt(0); //taking out the first digit of the inputted number
 
        if(c>0 && f!='0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}

