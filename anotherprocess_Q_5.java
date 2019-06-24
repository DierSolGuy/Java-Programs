import java.util.*;
class anotherprocess_Q_5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str;String sen="";String p2="";
        System.out.println("Enter the string");
        str=sc.nextLine();
        String temp;
        String arr1[]=new String[str.length()];
        int r=0;
        System.out.println("After arrangement");
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch==',')||(ch=='.')||(ch=='?')||(ch=='!'))
            {
                StringTokenizer ob=new StringTokenizer(sen);
                int c=ob.countTokens();
                String arr[]=new String[c];
                int k=0;
                int j=0;
                while(j<c)
                {
                    String p=ob.nextToken();
                    String pu=p.toUpperCase();
                    //int ln =pu.length();
                        char chp=pu.charAt(0);
                        arr[k]=pu;
                        k++;
                        if(chp=='A'||chp=='E'||chp=='I'||chp=='O'||chp=='U')
                        {
                            arr1[r]=p;
                            r=r+1;
                        }
                        j++;
                    }
                    for(int m=0;m<(c-1);m++)
                    {
                        for(int n=(m+1);n<c;n++)
                        {
                            if(arr[m].compareTo(arr[n])>0)
                            {
                                temp=arr[m];
                                arr[m]=arr[n];
                                arr[n]=temp;
                            }
                        }
                    }
                    for(int a=0;a<c;a++)
                    System.out.print(arr[a]+" ");
                    System.out.print(ch+" ");
                    sen="";
                }
                else
                {
                    sen=sen+ch;
                }
            }
            System.out.println("Vowel words:");
            for(int d=0;d<r;d++)
            System.out.print(arr1[d]+",");
        }
}
