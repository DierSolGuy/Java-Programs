/**
* The class IsFibonacci inputs a number and checks whether
* it belongs to the Fibonacci Series or not
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.io.*;
class IsFibonacci
{
public static void main(String args[])throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter a number : "); // Inputting a number
     int n = Integer.parseInt(br.readLine());
      
     if(n<0)
        System.out.println("Kindly enter a positive number.");
     else
     {
         int a=0, b=1 ,c=0;
         /* 'a' is the 1st term, 'b' is the 2nd term and 'c' is the 3rd term
          * 'c' stores the last generated term of the Fibonacci series */
      
          while(c<(n-2)) // Loop goes on till the 3rd term is less than the given number
          {
              c = a + b;// Generating the terms of Fibonacci Series
              System.out.println(c);
              a = b;
              b = c;
          }
      
          /* When the control comes out of the while loop, either the
           * 3rd term is equal to the number or greater than it */
         
           if(c==n) // If the last term = number, then it belongs to Fibonacci Series
              System.out.println("Output : The number belongs to Fibonacci Series.");
           else
              System.out.println("Output : The number does not belong to Fibonacci Series.");
     }
   }
}


