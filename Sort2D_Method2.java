import java.io.*;
class Sort2D_Method2
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
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
 
            /* Sorting the 2D Array */
 
            
            for(int x=0;x<r;x++)
            {
                for(int y=0;y<c;y++)
                {
                    for(int i=0;i<r;i++)
                    {
                        for(int j=0;j<c;j++)
                        {
                            
                            if((i+j)==(r-1)&&(x+y)==(r-1))
                            {
                                if(A[i][j]>A[x][y])
                                
                                {
                                    
                                    
                                        int t=A[x][y];
                                        A[x][y]=A[i][j];
                                        A[i][j]=t;
                                     
                                }
                         }
                }
            }
        }
    }
 
            /* Printing the sorted 2D Array */
 
            System.out.println("The Sorted Array:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

