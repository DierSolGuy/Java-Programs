/**
 * The class Swapping_Method1 takes 2 numbers as input and swaps their value without using any 3rd variable
 * This is Method 1
 * @author : www.javaforschool.com
 * @Program Type : BlueJ Program - Java
 */
 
import java.io.*;
class Swapwith2variables
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int a,b;
            System.out.print("Enter the 1st no: ");
            a=Integer.parseInt(br.readLine());
            System.out.print("Enter the 2nd no: ");
            b=Integer.parseInt(br.readLine());
 
            System.out.println("-------------------------------");
            System.out.println("The numbers before swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
 
            //Beginning of Swapping
            a=a^b;
            b=a^b;
            a=a^b;
            //End of Swapping
 
            System.out.println("-------------------------------");
            System.out.println("The numbers after swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }


