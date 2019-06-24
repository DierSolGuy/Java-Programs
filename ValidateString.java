/**
c:\sourish\temp>javac ValidateString.java

c:\sourish\temp>java ValidateString
Enter your string: SUN (A) RISE BEGINS FROM (RT) EAST
SUN  RISE BEGINS FROM  EAST

c:\sourish\temp>java ValidateString
Enter your string: SUN (A(X)RISE) BEGINS FROM (RT) EAST
Sorry, this is not a valid string.

c:\sourish\temp>java ValidateString
Enter your string: COM (IPX) PUTER IS (MY) JUNK (GOOD) SYSTEM
COM  PUTER IS  JUNK  SYSTEM

c:\sourish\temp>java ValidateString
Enter your string: COM(IPX)PUTER IS (MY) JUNK (GOOD) SYSTEM
COMPUTER IS  JUNK  SYSTEM
*/

import java.io.*;

class ValidateString {

    public static void main(String[] args)throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your string: ");
        char[] ipStr = br.readLine().toUpperCase().toCharArray();
        
        boolean inBracket = false;
        String opStr = "";
        
        /**
        * Conditions not covered in the question
        *   What if the string has no brackets? 
        *   What if the string has invalid paranthesization, i.e. mismatched number of brackets? Like "(Hi)) This is (a) string". 
        *
        * All uncovered conditions will be marked valid by this program because they contain 0 nested paranthesis and hence are not invalid by definition
        */
        
        for (int i = 0; i < ipStr.length; i++)
        {
        
            if (ipStr[i] == '(')//When there is an opening bracket
            { 
            
                if (inBracket)  //And we are already in a bracket
                {
                    opStr = "Sorry, this is not a valid string."; //String is invalid, no need to continue checking
                    break;
                }
                else //If it's not a nested bracket, we need to remember that we just entered a bracket.
                    inBracket = true;
            }
            else if (ipStr[i] == ')') //We just came out of a bracket
                inBracket = false;
            else if (!inBracket) //If it's not a paranthesis (normal text), we need to copy it
                opStr += ipStr[i];
                
        }
        System.out.println("\n");
        System.out.print("Output: ");
        
        System.out.print(opStr);
    }
    
}       