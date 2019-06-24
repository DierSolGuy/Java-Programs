import java.io.*;
class Boundary_Element
{
    public static void main(String args[])throws IOException
    {
        int i,j,r,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        System.out.print("Enter the no. of  rows: "); //Inputting the number of rows
        r=Integer.parseInt(br.readLine());
        System.out.print("Enter the no. of columns: "); //Inputting the number of columns
        c=Integer.parseInt(br.readLine());
 
        int A[][]=new int[r][c]; //Creating the array
         
        /* Inputting the array */
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter the elements: ");
                A[i][j]=Integer.parseInt(br.readLine());
            }
        }
         
        System.out.println("The Boundary Elements are:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i==0 || j==0 || i == r-1 || j == c-1) //condition for accessing boundary elements
                    System.out.print(A[i][j]+"\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}
