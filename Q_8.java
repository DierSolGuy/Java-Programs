/**
*The class Q_8_ISC_2001 Generate Lucky No.
*Program No. on project sheet:164
*Page No. on project sheet: 377
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2001. 
*/


import java.util.*;
class Q_8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=i+1;
        int b=2,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==0)
                continue;
                else
                c++;
                if(c%b==0&&c>1)
                arr[j]=0;
            }
            c=0;
            b++;
        }
        System.out.println("Lucky No. are");
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            System.out.print(arr[i]+" ");
        }
    }
}