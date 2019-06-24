import java.util.*;
class longshort_word
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine().toUpperCase();
        int l=s.length();
        char last=s.charAt(l-1);
        if(last=='.'||last=='?'||last=='!')
        
        {
            StringTokenizer ob = new StringTokenizer(s," !.?");
            int c=ob.countTokens();
            //String word[]=new String[c];
            int len=0,sh=0;
            String lw="",sw="";
            while(ob.hasMoreTokens())
            {
                
                String p=ob.nextToken();
                int g=p.length();
                if(g>len)
                {
                    len=g;
                    lw=p;
                }
                else
                {
                    sh=g;
                    sw=p;
                }
            }
            System.out.println("Length of the sentence: "+c);
            System.out.println("Longest word: "+lw);
            System.out.println("Shortest word: "+sw);
            String word[]=s.split("[.?! ]");
            
            for(int i=0;i<c-1;i++)
            {
                for(int j=0;j<c-1-i;j++)
                {
                    if(word[j].compareTo(word[j+1])>0)
                    {
                        String temp=word[j];
                        word[j]=word[j+1];
                        word[j+1]=temp;
                    }
                }
            }
            System.out.print("Rearranged Sentence: ");
            for(int i=0;i<word.length;i++)
            System.out.print(word[i]+" ");
            
            
        }
        else
        System.out.println("End a Sentence with '?', '.','!'");
    }
}