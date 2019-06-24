import java.io.*;
class Hcf
    {
        public static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the First no : ");
            int n1=Integer.parseInt(br.readLine());
            System.out.print("Enter the Second no : ");
            int n2=Integer.parseInt(br.readLine());
            int hcf=0;
            int min = Math.min(n1,n2);
             
            for(int i=1; i <= min; i++)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    hcf = i;
                }
            }
            int lcm=(n1*n2)/hcf;
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
            System.out.print("\nThe lcm of "+n1+" and "+n2+" = "+lcm);
        
        }
    }

