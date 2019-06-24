import java.util.*;
class Happy_No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any No.: ");
        int n=sc.nextInt();
        
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=(int)Math.pow(rem,2);
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        System.out.println("Happy No.");
        else
        System.out.println("Not a Happy No.");
    }
}