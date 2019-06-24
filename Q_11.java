/**
*The class Q_11_ISC_2004 Encoding And Decoding a String from a list of Number by reversing the number.
*Program No. on project sheet:6
*Page No. on project sheet: 220
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2004. 
*/


import java.util.*;
class Q_11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Encoded message: ");
        String str=sc.nextLine();
        int n=str.length();
        if(n>200)
        {
            System.out.println("Coded message has exceeded 200 Characters");
            System.out.println("Enter the Encoded message: ");
            str=sc.nextLine();
        }
        String str1="",str2="",str3="",str4="",str5="";
        int k=0,y=0;
        char chr=' ';
        
        for(int i=n-1;i>=0;i--)
        {
           str1+=str.charAt(i);
        }
        while(k<n)
        {
            char ch=str1.charAt(k);
            if(ch>'1')
            {
                str2=str1.substring(k,k+2);
                y=Integer.parseInt(str2);
                chr=(char)y;
                k+=2;
            }
            else
            {
                str2=str1.substring(k,k+3);
                y=Integer.parseInt(str2);
                chr=(char)y;
                k+=3;
            }
            str3+=chr;
        }
        str3=str3.toLowerCase();
        str3=str3.trim();
        str3=" "+str3;
        char ch1=' ';
        for(int i=0;i<str3.length();)
        {
            char ch=str3.charAt(i);
            
            if(ch!=' ')
            {
                str4+=ch;
                i++;
            }
            else
            {
                ch1=Character.toUpperCase((str3.charAt(i+1)));
                str4=str4+" "+ch1;
                i+=2;
            }
        }
        str4=str4.trim();
        System.out.print("\n");
        System.out.print("Output:");
        System.out.println("\n");
        System.out.println("The Encoded message: ");
        System.out.println(str);
        System.out.println("The Decoded message: ");
        System.out.println(str4+".");
    }
}