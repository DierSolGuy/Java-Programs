import java.util.*;
class wondrous_square
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n =sc.nextInt();
        if(n<2||n>10)
        System.out.println("!!Invalid size!!");
        else
        {
            int arr[][]=new int[n][n];
            int a = (int)(0.5*n*((n*n)+1));//Explicit conversion
            int sum1=0,sum2=0,c=0;
            System.out.println("Enter the element of the matrix: ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("Enter the element ["+i+"]["+j+"]: " );
                arr[i][j]=sc.nextInt();
                }
            }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                 sum1+=arr[i][j];
                 sum2+=arr[j][i];
                 
                }
                 if(sum1==a&&a==sum2)
                 {
                     c=c+2;
                     sum1=0;
                     sum2=0;
                     
                    }
                    else
                    {
                        System.out.println("\n");
                         System.out.println("Not a wondrous square.");
                         
                        break;
                    }
                }
                if(c==(n*2))
                {
                    System.out.println("\n");
                    System.out.println("Yes ,Wondrous Square");
                        
            }
        }
    }
}