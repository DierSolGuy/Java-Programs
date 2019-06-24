import java.io.*;
public class permutation {
    public static void main(String args[]) throws IOException
    {
        String str;
        System.out.println("Enter the initial string");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        System.out.println("Permutations are :");
        permute("", str);
    }

  public static void permute(String beginningString, String endingString)
  {
    if (endingString.length() <= 1)
      System.out.println(beginningString + endingString);
    else
      for (int i = 0; i < endingString.length(); i++) 
      {
        try 
        {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permute(beginningString + endingString.charAt(i), newString);
        } 
        catch (StringIndexOutOfBoundsException exception)
        {
          exception.printStackTrace();
        }
      }
  }
}