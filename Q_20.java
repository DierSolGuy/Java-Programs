/**
*The class Q_20_ISC_2009 accepts elements in a 2-D array , and sort the bounday elements,print the boundary elements and its sum.
*Program No. on project sheet:184
*Page No. on project sheet: 388-389
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2002. 
*/



import java.util.*;
class Q_20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows and columns(>2and <20) : ");
        int m=sc.nextInt();
        int n=sc.nextInt();

        if(m<2 || n<2 || m>20 || n>20)
        System.out.println("Rows and columns should be more than 2 and less than 20.");
        else{
            int a[][]=new int[m][n];
            int i,j,x,t,c;
            System.out.println("Enter "+m*n+" elements for the matrix : ");
            for(i=0;i< m;i++)
            {
                for(j=0;j< n;j++)
                {
                    System.out.print("Enter the elements of ["+i+"]["+j+"]: " );
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("\nOriginal Matrix : ");
            for(i=0;i< m;i++)
            {
                for(j=0;j< n;j++)
                System.out.print(a[i][j]+"\t");
    
                System.out.println();
            }

            int b[]=new int[2*m+2*n-4];
            x=0;
            //STORE THE ELEMENTS OF THE OUTER ROW AND COLUMN
            //IN A 1-D ARRAY
            for(i=0;i< m;i++)
            {
                for(j=0;j< n;j++)
                {
                    // CONDITION FOR BOUNDARY ELEMENTS
                    if(i==0 || j==0 || i==m-1 || j==n-1)
                    b[x++]=a[i][j];
                }
            }
            //SORT THE 1-D ARRAY IN ASCENDING ORDER
            for(i=0;i< x-1;i++)
            {
                for(j=i+1;j< x;j++)
                {
                    if(b[i]>b[j])
                    {
                        t=b[i];
                        b[i]=b[j];
                        b[j]=t;
                    }
                }
            }

            /*PLACE THE SORTED ELEMENTS FROM 1-D ARRAY INTO THE 2-D ARRAY*/
            
            c=0;
            for(i=0;i< n;i++)
            a[0][i]=b[c++];

            for(i=1;i< m;i++)
            a[i][n-1]=b[c++];

            for(i=n-2;i>=0;i--)
            a[m-1][i]=b[c++];
 
            for(i=m-2;i> 0;i--)
            a[i][0]=b[c++];

            System.out.println("REARRANGED MATRIX : ");
            for(i=0;i< m;i++)
            {
                for(j=0;j< n;j++)
                System.out.print(a[i][j]+"\t");
    
                System.out.println();
            }
            int sum=0;
            System.out.println("BOUNDARY ELEMENTS : ");
            for(i=0;i< m;i++)
            {
                for(j=0;j< n;j++)
                {
                    if(i==0 || j==0 || i==m-1 || j==n-1)
                    {
                        sum+=a[i][j];
                        System.out.print(a[i][j]+" ");
                    }
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println("Sum of the Boundary Elements:  "+sum);
        }
}//end of main
}//end of class