/**
*The class Q_17, accepts elements in a 1-D array , calculates and displays the pendulum_smallest array
*Program No. on project sheet: 171
*Page No. on project sheet: 381
* @Program Type : BlueJ Program - Java
*/


import java.util.*;
class Q_17
{
    Scanner sc= new Scanner(System.in);
    int n;
    int arr[];
    Q_17(int a)
    {
        n=a;
        arr=new int[n];
    }
     void main(String args[])
     {
           
            if(n<0)
            System.out.println("!!Invalid Input!!");
            else
            {

                Q_17 ob=new  Q_17(n); //object created to store the pendulum elements
                System.out.println("Enter the elements: ");
                for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
                
                System.out.println("\n");
                System.out.println("Inputed array");
                for(int i=0;i<n;i++)
                  System.out.print(arr[i]+" ");
                
                for(int i=0;i<n-1;i++)
                {
                    for(int j=0;j<n-1-i;j++)
                    {
                        if(arr[j]>arr[j+1])
                        {
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
                int mid=(n-1)/2;
                   int lim=(n-1-mid),x=1;
                   
                   ob.arr[mid]=arr[0];
                   for(int i=1;i<=lim;i++)
                   {
                       if((mid+i)<n)
                       ob.arr[mid+i]=arr[x++];
                       if((mid-i)>=0)
                       ob.arr[mid-i]=arr[x++];
                    }
                    
                    System.out.println("\n");
                    System.out.println("output as Pendulum_smallest array");
                    
                    for(int i=0;i<n;i++)
                    System.out.print(ob.arr[i]+"\t");
                }
            }
        }
          