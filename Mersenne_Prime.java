/* 
 *Question: Print all mersenne Prime No. between 1 to 1000.

*/



import java.util.*;
class Mersenne_Prime
{
    static boolean isprime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==2)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    {
        
        System.out.print("MERSENNE PRIME NO.: ");
        int c=0;
        for(int i=1;i<=1000;i++)
        {
            if(isprime(i))// if the Original Number is prime
            {
                int s=0;
                s=(int)Math.pow(2,i)-1;//formula of mersenne prime
                if(isprime(s))// if the calculated No. is prime and less than the given limit
                {
                    if(s<=1000)
                    {
                        if(c==0)
                            System.out.print(s+" ");
                            else
                            System.out.print(", "+s);
                            c++;
                        }
                        else //if the calculated number ,i.e s, is greater than the limit then control will be outside the loop
                            break;
                }
            }
            else//if the number is not a prime then we move on tho the next iteration
                continue;
        }
        System.out.print(".");
    }
}
        
            