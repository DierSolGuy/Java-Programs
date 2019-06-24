/**
*The class Q_7_Encode a string and shift the characters by 2 and print it.
*Program No. on project sheet:166
*Page No. on project sheet:378
* @Program Type : BlueJ Program - Java
*/


import java.util.*;
class Q_7
{
    static char convert(char ch)
    {
        if(ch=='Z')
        return 'B';
        else if(ch=='z')
        return 'b';
        else if(ch=='y')
        return 'a';
        else if(ch=='Y')
        return 'A';
        else 
        return (char)(ch+2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encoded message:");
        String str=sc.nextLine();
        str=str.toUpperCase();
                 
        String str1="";
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            
            if(ch=='K'&&str.charAt(i+1)=='K'&&i<n)
            {
                
                    str1+=" ";
                    i++;
                
            }
            
            else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
            continue;
            else
            str1+=convert(ch);
            
        }
        System.out.print("\n");
        System.out.print("Output:");
        System.out.println("\n");
        System.out.println("The Encoded message: ");
        System.out.println(str);
        System.out.println("The Decoded message: ");
        System.out.println(str1);
    }
}

 
