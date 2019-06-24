/**
*The class Q_5 accept a sentence and arrange the sentence in alphabeticl order and seperate the the words starts with vowel
*Program No. on project sheet:157
*Page No. on project sheet: 373
 * @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2002. 
*/



import java.util.*;
class Q_5
{
    public static void main(String args[])
    {
        String s="",s1="",s2="";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int b=sc1.nextInt();
        System.out.println("\n"); 
        
            for(int l=1;l<=b;l++)
            {
                System.out.print("Enter sentences: ");
                s=sc.nextLine();
                s=s.toUpperCase();
                int n=s.length();
                System.out.print("Output:- ");
                for(int j=0;j<n;j++)
                {
                    char ch=s.charAt(j);
                    if(ch=='!'||ch=='?'||ch==','||ch=='.')
                    {
                       /* StringTokenizer ob = new StringTokenizer(s1,"' '");
                        int a = ob.countTokens();
                        arr=new String[a];
                        int k=0;
                        for(int i=0;i<a;i++)
                        {
                            arr[k]=ob.nextToken();
                            k++;
                        }
                        k=0;*/
                        //Arrays.sort(arr);
                        String arr[]=s1.split("[ .]");
                        int a=arr.length;
                       for(int m=0;m<arr.length-1;m++)
                        {
                            for(int p=0;p<arr.length-1-m;p++)
                            {
                                if(arr[p].compareTo(arr[p+1])>0)
                                {
                                    String temp=arr[p];
                                    arr[p]=arr[p+1];
                                    arr[p+1]=temp;
                                }
                            }
                        }
                        for(int i=0;i<a;i++)
                        s2+=" "+arr[i];
                        s2+=ch+" ";
                        s1="";
                    }
                    else 
                    s1+=ch;
                }
                System.out.print(s2.trim());
                s2="";
                System.out.println();
                System.out.print("Vowel words:- ");
                int k=0;
                StringTokenizer ob1 = new StringTokenizer(s,"!,?.' '");
                
                while(ob1.hasMoreTokens())
                    {
                        String p=ob1.nextToken();
                        char c=p.charAt(0);
                        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                        {
                            if(k==0)
                            System.out.print(p+" ");
                            else
                            System.out.print(", "+p);
                            k++;
                        }
                        else
                        continue;
                } 
                System.out.print(".");
            }            
        }
    }
 

