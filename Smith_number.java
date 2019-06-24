import java.util.*;
class Smith_number
{
    static Scanner sc=new Scanner(System.in);
    //function for finding sum of digits
    int sumDig(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
     
    //function for generating prime factors and finding their sum
    int sumPrimeFact(int n)
    {
        int sum=0;
        for(int i=2;i<=n;)// since prime factors except 1,so the condition is (n>1),otherwise it would be (n>0)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i); //Here 'i' is the prime factor of 'n' and we are finding its sum
                n=n/i;
            }
            else
                i++;
        }
        return sum;
    }
 
public static void main(String args[])
{
    Smith_number ob=new Smith_number();
    System.out.print("Enter a Number : ");
    int n=sc.nextInt();
    int a=ob.sumDig(n);// finding sum of digit
    int b=ob.sumPrimeFact(n); //finding sum of prime factors
     
    System.out.println("Sum of Digit = "+a);
    System.out.println("Sum of Prime Factor = "+b);
     
    if(a==b)
    System.out.print("It is a Smith Number");
    else
    System.out.print("It is Not a Smith Number");
}
}
