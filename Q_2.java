/**
*The class Q_2_ISC_1998 spiral Matrix(Ascending Order)
*Program No. on project sheet:162
*Page No. on project sheet: 377
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 1998. 
*/

import java.util.*;
class Q_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int b=n*n;
        int a[][]=new int[n][n];
        int lr=0,ur=n-1,lc=0,uc=n-1;
        for(int k=1;k<=b;)
        {
            for(int i=lc;i<=uc;i++)
            {
                a[lr][i]=k;
                k++;
            }
            for(int i=lr+1;i<=ur;i++)
            {
                a[i][uc]=k;
                k++;
            }
            for(int i=uc-1;i>=lc;i--)
            {
                a[ur][i]=k;
                k++;
            }
            for(int i=ur-1;i>=lr+1;i--)
            {
                a[i][lc]=k;
                k++;
            }
            lr++;ur--;
            lc++;uc--;
        }
        System.out.println("Circular Matrix is below");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
        