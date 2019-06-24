import java.util.*;
class NumberFreq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        String s=Integer.toString(n);
  
        s=s.toLowerCase(); //converting the string into lowercase
        int l=s.length(); //finding the length of the string
  
        int arr[]={'0','1','2','3','4','5','6','7','8','9'};
        
        System.out.println("Output:");
        System.out.println("=========================="); //this is just for styling the look of the output
        System.out.println("Number\tFrequency");
        System.out.println("==========================");
  
        /* Counting frequency of alphabets begins below */
        int count=0;
        for(int i=0; i<=9; i++)
            {
                count = 0;
                for(int j=0; j<l; j++)
                {
                    char ch=s.charAt(j); //extracting characters of the string one by one
                    if(ch==arr[i]) //first checking the whole string for 'a', then 'b' and so on
                        count++; //increasing count of those aplhabets which are present in the string
                }
                if(count!=0)//printing only those alphabets whose count is not '0'
                {
                    System.out.println(i+"\t\t"+count);
                }
            }
    }
}


