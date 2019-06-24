/**
* The class Q_4_ISC_1999 MOBIUS FUNCTION
* Program No. on project sheet: 9
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 1999
*/
import java.util.*;
class Q_4
{
   
  static int prime(int c)   //to get length of array by counting the prime factors
    {  int d=0; 
      for(int i=2;i<=c;)
      {
        if(c%i==0)
        {
                d++;
                c/=i;
        }
        else
        i++;
    }
        return d;
    }
    public static void main(String args[])
    {
        
        int n=0,b=0,flag =0,pw;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit:");
        n=sc.nextInt();
        System.out.print("\n");
        for (int m=1;m<=n;m++)
        {
            System.out.print("Enter a Number:");
            int a=sc.nextInt();
            int x=a;
            int arr[]=new int[prime(a)];
             
            for(int i=2;i<=x;)  //calculating prime factors and storing it in array
            {
               if(x%i==0)
               {
                    arr[b]=i;
                    b++;
                    x/=i;
                }
                else
                i++;
            }
            b=0;
            System.out.print("Prime Factors of "+a+" are: ");
            System.out.println(Arrays.toString(arr));       //displaying the prime factors
            for(int l=0;l<arr.length-1;l++)
              {
                for(int j=l+1;j<arr.length;j++)
                {
                    if(arr[l]==arr[j])
                    {
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println("Flag: "+flag);
            if(flag==1)
            
            System.out.println("M("+a+"): "+0);
            else
            
                {
                 pw =(int)Math.pow((-1),arr.length);
                System.out.println("M("+a+"):"+pw);
                }
                
                /*for(int l=0;l<arr.length;l++)
                arr[l]=0;*/
            flag=0;
            System.out.print("\n");
        }
    }
}
    
