import java.io.*;
class Sort2D_Method1
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
            System.out.print("Enter the no. of  rows: "); //inputting number of rows
            int r=Integer.parseInt(br.readLine());
            System.out.print("Enter the no. of columns: "); //inputting number of columns
            int c=Integer.parseInt(br.readLine());
 
            int A[][]=new int[r][c]; //creating a 2D array
             
            /* Inputting the 2D Array */
 
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print("Enter the elements: ");
                    A[i][j]=Integer.parseInt(br.readLine());
                }
            }       
     
            /* Printing the original 2D Array */
 
            System.out.println("The original array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
 
            /* Saving the 2D Array into a 1D Array */
            int a=((r*c)-(int)(Math.pow(r-2,2)));
            int B[]=new int[a]; //creating a 1D Array of size 'r*c'
            int x = 0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==0||j==0||i==r-1||j==c-1)
                    {
                        B[x] = A[i][j];
                        x++;
                    }
                }
            }
             
            /*Sorting the 1D Array in Ascending Order*/
 
            
            for(int i=0; i<a-1; i++)
            {
                for(int j=i+1; j<a; j++)
                {
                    if(B[i]>B[j])
                    {
                       int t=B[i];
                        B[i]=B[j];
                        B[j]=t;
                    }
                }
            }
            for(int i=0;i<a;i++)
            System.out.print(B[i]+",");
             
            /*Saving the sorted 1D Array back into the 2D Array */
 
            x = 0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==0||j==0||i==r-1||j==c-1)
                    {
                        A[i][j] = B[x];
                        x++;
                    }
                }
            }
 
            /* Printing the sorted 2D Array */
 
            System.out.println("The Sorted Array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }


