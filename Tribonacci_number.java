import java.util.*;
class Tribonacci_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        int x=0,y=1,z=2,c=0;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        while(c<(n-3))
        {
            c=x+y+z;
            System.out.println(c);
            x=y;
            y=z;
            z=c;
        }
        if(n==c)
        System.out.println("It is a Tribonacci Number");
        else
        System.out.println("It is not a Tribonacci Number");
    }
}
            
        