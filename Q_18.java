 /**
*The class Q_18_ISC_2002 accepts elements in a 1-D array , calculates and displays the pendulum_greatest array
*Program No. on project sheet:184
*Page No. on project sheet: 388-389
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2002. 
*/



import java.util.*;
class Q_18
{
    Scanner sc = new Scanner(System.in);
    int arr[];
    int n;
    Q_18(int a)
    {
        n=a;
        arr=new int[n];
    }
    void main(String args[])
    {
        if(n>50)
        System.out.println("!!Invalid size of the array!!");
        else
        {
            Q_18 ob = new Q_18(n);
             System.out.println("Enter the values of array");
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
                     if(arr[j]<arr[j+1])
                     {
                         int temp = arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                        }
                    }
                }
                int mid=(n-1)/2;
                int lim=n-1-mid,x=1;
                ob.arr[mid]=arr[0];
                for(int i=1;i<=lim;i++)
                {
                    if((mid+i)<n)
                    ob.arr[mid+i]=arr[x++];
                    if((mid-i)>=0)
                    ob.arr[mid-i]=arr[x++];
                }
                
                 System.out.println("\n");
                 System.out.println("Pendulum_greatest array is:");
                 for(int i=0;i<n;i++)
                  System.out.print(ob.arr[i]+" ");
                }
            }
        }
