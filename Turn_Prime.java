import java.util.*;
class Turn_Prime
{
    static Scanner sc = new Scanner(System.in);
    public static boolean isprime(int n)
    {
        int count=0;
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
            System.out.print("Enter the lower limit: ");
            int p=sc.nextInt();
            System.out.print("Enter the upper limit: ");
            int q=sc.nextInt();
            