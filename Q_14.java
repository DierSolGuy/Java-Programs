/**
* The class Q_14_ISC_2007 inputs digits and check it unique-digit integer or not
*  Program No. on project sheet: 165
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2007. 
*/

import java.util.*;
class Q_14
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit:");
        int p=sc.nextInt();
        System.out.print("\n");
        for (int q=1;q<=p;q++)
        {
            
            System.out.println("Enter the range of checking unique digits: ");
            System.out.print("lower range: ");
            int m=sc.nextInt();
            System.out.print("upper range: ");
            int n=sc.nextInt();
            System.out.println();
            int flag=0;
            if(m>30000||n>30000)
            {
                System.out.println("!!Range Exceeded!!");
                System.out.println("\n");
            }
                else
                {
                    if(m<n)
                    {
                        System.out.print("unique digit integers are: ");
                        for(int k=m;k<=n;k++)
                        {
                            String s=Integer.toString(k);
                            int a=s.length();
                            for(int i=0;i<a-1;i++)
                            {
                                for(int j=i+1;j<a;j++)
                                {
                                    if(s.charAt(i)==s.charAt(j))
                                    {
                                        flag=1;
                                        break;
                                    }
                                }
                            }
                            if(flag==0)
                            System.out.print(k+",");
                            else
                            {
                                flag=0;
                                continue;
                            }
                        }
                    }
                    else
                    {   
                        System.out.print("!!Invalid range!!");
                    }
                    System.out.println("\n");
                }
            }
        }
}