/**
* The class MatrixMultiplication inputs 2 Matrices and performs Matrix Multiplication on them
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.util.*;
class MatrixMultiplication
{
    void printMatrix(int P[][], int r, int c) // Funtion for printing an array
    {
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(P[i][j]+"\t");
            }
            System.out.println();
        }
    }
     
    public static void main()
    {
        MatrixMultiplication ob = new MatrixMultiplication();
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter no. of rows of 1st Matrix : ");
        int r1=sc.nextInt();
        System.out.print("Enter no. of columns of 1st Matrix : ");
        int c1=sc.nextInt();
         
        System.out.print("Enter no. of rows of 2nd Matrix : ");
        int r2=sc.nextInt();
        System.out.print("Enter no. of columns of 2nd Matrix : ");
        int c2=sc.nextInt();
         
        if(c1 != r2) // COndition for Multiplication to be possible
        {
            System.out.println("Matrix Multiplication of the given order is not possible");
        }
        else
        {
            int A[][]=new int[r1][c1]; // Array to store 1st Matrix
            int B[][]=new int[r2][c2]; // Array to store 2nd Matrix
            int C[][]=new int[r1][c2]; // Array to store Result of Multiplication of 2 Matrices
             
            System.out.println("*************************");
            System.out.println("Inputting the 1st Matrix");
            System.out.println("*************************");
            for(int i=0; i<r1; i++)
            {
                for(int j=0; j<c1; j++)
                {
                    System.out.print("Enter an element : ");
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("*************************");
            System.out.println("Inputting the 2nd Matrix");
            System.out.println("*************************");
            for(int i=0; i<r2; i++)
            {
                for(int j=0; j<c2; j++)
                {
                    System.out.print("Enter an element : ");
                    B[i][j]=sc.nextInt();
                }
            }
             
            /* Matrix Multiplication Starts Here */
             
            
            for(int i=0; i<r1; i++)
            {
                for(int j=0; j<c2; j++)
                {
                    for(int k=0; k<c1; k++)
                    {
                         C[i][j]+= A[i][k]*B[k][j];
                    }
                   
                }
            }
             
            /* Printing all the Matrices */
            System.out.println("\n*************************");
            System.out.println("          Output         ");
            System.out.println("*************************");
            System.out.println("The 1st Matrix is");
            ob.printMatrix(A,r1,c1);
            System.out.println("*************************");
            System.out.println("The 2nd Matrix is");
            ob.printMatrix(B,r2,c2);
            System.out.println("************************************");
            System.out.println("The Result of Multiplication is");
            ob.printMatrix(C,r1,c2);
        }
    }
}

