import java.io.*;
public class decitobin_sum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter No. 1: ");
		String n1 = br.readLine();
		
		System.out.print("Enter No. 2: ");
		String n2 = br.readLine();
		
		System.out.println();
		
		String oldn1 = n1, oldn2 = n2;
		
		n1 = Integer.toBinaryString(Integer.parseInt(n1));
		n2 = Integer.toBinaryString(Integer.parseInt(n2));
				
		int bn1 = Integer.parseInt(n1, 2);
		int bn2 = Integer.parseInt(n2, 2);
		String sum = Integer.toBinaryString(bn1 + bn2);
		
		System.out.println("Binary of " + oldn1 + " = " + n1);
		System.out.println("Binary of " + oldn2 + " = " + n2);
		System.out.println();
		
		System.out.println("Sum of " + n1 + " and " + n2 + " = " + sum);
		
		
	}

}