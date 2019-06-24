/**
*The class Q_6_ Special Function
*Program No. on project sheet:11
*Page No. on project sheet:238
* @Program Type : BlueJ Program - Java
*/


import java.util.*;
class Q_6
{
    static char convert(char ch)
    {
        if(ch=='Z')
        return 'A';
        else if(ch=='z')
        return 'a';
        else
        return (char)(ch+1);
    }
    public static void main(String args[])
    {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the limit: ");
            int b=sc1.nextInt();
            System.out.println("\n"); 
            for(int l=1;l<=b;l++)
            {
                String s="",s3="",s4="",s5="";
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a sentence:- ");
                s=sc.nextLine();
                System.out.println("Enter below two positions where the word has to be converted: ");
                int n=sc.nextInt();
                int m=sc.nextInt();
                String arr[]= new String[s.length()];
                int k=0;
                StringTokenizer ob = new StringTokenizer(s,".' '");
                int a=ob.countTokens();
                for(int i=0;i<a;i++)
                {
                    arr[k]=ob.nextToken();
                    k++;
                }
                String s1=arr[n-1];
                String s2=arr[m-1];
                for(int i=0;i<s1.length();i++)
                {
                    char c=s1.charAt(i);
                    s3+=convert(c);
                }
                arr[n-1]=s3;
                for(int i=0;i<s2.length();i++)
                {
                    char c=s2.charAt(i);
                    s4+=convert(c);
                }
                arr[m-1]=s4;
                for(int i=0;i<a;i++)
                s5+=" "+arr[i];
                s5=s5.trim();
                char ch=' ';
                if(Character.isLowerCase(s5.charAt(0)))
                {
                    ch = Character.toUpperCase(s5.charAt(0));
                }
                String str=(s5.substring(1)).toLowerCase();
                String str1=ch+str;
                System.out.println("output Sentence:- "+str1);
                System.out.println("\n");
            }
    }
}