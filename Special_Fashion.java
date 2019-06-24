import java.io.*;
class Special_Fashion
{
    String repChar(String s) //function doing the work of replacing characters
    {
        int l = s.length(), a = 0;
        char ch;
        String res="";
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i); //extracting characters one by one
            a = ch + 1; //storing ASCII values after adding 1 to the current character
            if(ch=='z' || ch=='Z')
            {
                a = a - 26;
            }
            res = res + (char)a; //finally adding the changed character to the new String
        }
        return res;
    }
                 
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        Special_Fashion ob = new Special_Fashion();
        System.out.print("nEnter any sentence : "); //Inputting the sentence
        String s = br.readLine();
        String ans=""; //String variable to store the final result
         
        String word[]=s.split("[. ]+"); //saving the words of the sentence in an array using split()
        int c = word.length;
         
        System.out.print("Enter the 1st word number : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter the 2nd word number : ");
        int y = Integer.parseInt(br.readLine());
         
        if(x<1 || y<1 || x>c || y>c) //checking whether integers inputted are acceptable or not
        {
            System.out.println("Sorry! The word numbers inputted are out of range");
        }
        else
        {
                if(x != y)
                {
                    word[y-1]=ob.repChar(word[y-1]); //sending the words to the repChar() function
                }
                word[x-1]=ob.repChar(word[x-1]);
                 
                for(int i=0; i<c; i++)
                {
                    ans = ans + word[i] + " ";
                }
                System.out.print("Output = "+ans.trim()+".");
        }
    }
}


