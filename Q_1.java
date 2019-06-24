/**
*The class Q_1_ISC_2010 generate kaprekar No.
*Program No. on project sheet:10
*Page No. on project sheet: 235
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2010. 
*/


import java.util.*;
class Q_1 
{
    public static boolean kap(int a)
    {
        int x=(a*a);
        int m=a,d=0;
        while(m>0)      //counting number of digits
        {
            m/=10;
            d++;
        }
        int pw = (int)Math.pow(10,d);
        int rem = x%pw;
        int quo = x/pw;
        int add = rem+quo;
        if(add==a)
        return true;
        else 
        return false;
    }

    public static void main(String args[])
    {
      Scanner sc1 = new Scanner(System.in);
      System.out.print("Enter the limit: ");
      int b=sc1.nextInt();
      System.out.println("\n"); 
      for(int l=1;l<=b;l++)
      {
        int p,q,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        p=sc.nextInt();
        System.out.println("Enter the upper limit: ");
        q=sc.nextInt();
        System.out.print("Kaprekar Number: ");
        for(int i=p;i<=q;i++)
        {
            if(kap(i)==true)
            {
                count++;
                System.out.print(i+",");
            }
        }
        System.out.println();
        System.out.println("Frequency of Kaprekar Number is: "+count);
        System.out.println("\n");
      }
    }
}