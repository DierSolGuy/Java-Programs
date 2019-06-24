/**
*The class Q_12_ Encoding And Decoding a String from a list of Number.
*Program No. on project sheet:6
*Page No. on project sheet: 221
* @Program Type : BlueJ Program - Java
*/



import java.util.*;
class Q_12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Encoded message: ");
        String str=sc.nextLine();
        int n=str.length();
        if(n>201)
        {
            System.out.println("Coded message has exceeded 200 Characters");
            System.out.println("Enter the Encoded message: ");
            str=sc.nextLine();
        }
        String str1="",str2="",str3="";
        int k=0,y=0;
        char chr=' ';
        
        while(k<n)
        {
            char ch=str.charAt(k);
            if(ch>'1')
            {
                str1=str.substring(k,k+2);
                y=Integer.parseInt(str1);
                chr=(char)y;
                k+=2;
            }
            else
            {
                str1=str.substring(k,k+3);
                y=Integer.parseInt(str1);
                chr=(char)y;
                k+=3;
            }
            str2+=chr;
        }
        str2=str2.toLowerCase();
        str2=str2.trim();
        str2=" "+str2;
        char ch1=' ';
        for(int i=0;i<str2.length();)
        {
            char ch=str2.charAt(i);
            
            if(ch!=' ')
            {
                str3+=ch;
                i++;
            }
            else
            {
                ch1=Character.toUpperCase((str2.charAt(i+1)));
                str3=str3+" "+ch1;
                i+=2;
            }
        }
        str3=str3.trim();
        System.out.print("\n");
        System.out.print("Output:");
        System.out.println("\n");
        System.out.println("The Encoded message: ");
        System.out.println(str);
        System.out.println("The Decoded message: ");
        System.out.println(str3+".");
    }
}