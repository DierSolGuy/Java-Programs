/* suppose 233
 * 233 is prime
 * 233/10=23=prime
 * 23/10=2=prime
 * as the 2 is less than 10 and it is prime
 * hence the original No(233) is Super Prime
 */






import java.util.*;
class Super_prime
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int p=sc.nextInt();
        System.out.println();
        System.out.print("Enter the upper Limit: ");
        int q=sc.nextInt();
        int c=0,n=0;
        for(int i=p;i<=q;i++)
        {
            if(isprime(i))
            {
                n=i;
                while(n>9)
                {
                    n/=10;
                    if(isprime(n))
                        continue;
                        else
                        break;
                }
                if(isprime(n))
                {
                    if(c==0)
                    System.out.print(i+" ");
                    else
                    System.out.print(", "+i);
                    c++;
                }
                else 
                    continue;
            }
            
            else
               continue;
               
               
        }
       System.out.print(".");
    }
}
            
           