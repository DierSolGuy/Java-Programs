/**
*The class Q_3_ISC_2009 Arrange the words in a Ascending Order According to their length.
*Program No. on project sheet:2
*Page No. on project sheet: 207
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2009. 
*/



import java.util.*;
class Q_3
{
    public static void main(String args[])
    {
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Sentence: ");
        str = sc.nextLine();
        str = str.toLowerCase();
        StringTokenizer ob = new StringTokenizer(str,".' '");
        int n = ob.countTokens(),k=0;
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[k] = ob.nextToken();
            k++;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if((arr[j].length())>(arr[j+1].length()))
                {
                    String temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       
       String s="";
        for(int i=0;i<n;i++)
        s+=" "+arr[i];
        s=s.trim();
        char ch=' ';
         if(Character.isLowerCase(s.charAt(0)))
        {
           ch = Character.toUpperCase(s.charAt(0));
        }
        String s2=(s.substring(1)).toLowerCase();
        String s3=ch+s2;
        System.out.println("The output Sentence: "+s3+".");
    }          
}
        
        
        
    
