import java.io.*;
class RemoveDupChar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s = br.readLine();
        //s=s+" ";
        int l = s.length();
        char ch;
        String ans="";
         
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
                ans = ans + ch;
                
            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
 
       System.out.println("Word after removing duplicate characters : " + ans);
    }
}

