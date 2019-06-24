import java.io.*;
class InsertWord
{          
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
 
        System.out.print("Enter any sentence : "); // Inputting the sentence
        String s = br.readLine();
        s = s.toUpperCase(); // Converting the sentence into Upper Case
        int l = s.length();
       
        String ans=""; // String variable to store the final result
        char last = s.charAt(l-1); // Extracting the last character
         
        /* Checking whether the sentence ends with '.', '?' or a '!' or not */
        if(last == '.' || last == '?' || last == '!')
        {
            String word[]=s.split("[.?! ]+"); // Saving the words in an array using split()
            int c = word.length; // Finding the number of words
         
            System.out.print("Enter the word to delete : ");
            String ins = br.readLine();
            ins = ins.toUpperCase();
 
            System.out.print("Enter the word position in the sentence : ");
            int x = Integer.parseInt(br.readLine());
         
            if(x<1 || x>c) // Checking whether integer inputted is acceptable or not
            {
                System.out.println("Sorry! The word position entered is out of range");
            }
 
            else
            {     
                for(int i=0; i<c; i++)
                {
                    /* inserting the word */
                    if(i == x-1)
                    ans = ans +ins+" ";
                        
                    ans = ans + word[i] + " ";
                }
                System.out.print("Output : "+ans.trim()+last);
            }
        }
 
        else
        {
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!'");
        }
    }
}

