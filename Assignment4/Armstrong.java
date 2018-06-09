package assignment3;
import java.util.Scanner;
public class Armstrong {
	public static void main(String args[])
	   {
	      int n;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Input a number to check if it is an Armstrong number");      
	      n = in.nextInt();
		  arm(n);
	   }
		public static void arm(int n)
		{
			int sum = 0, m, rem, a = 0;
			m = n;
			while (m != 0) {
	         a++;
	         m = m/10;
	      }
	      m = n;
	      while (m != 0) {
	         rem = m%10;
	         sum = sum + power(rem, a);
	         m = m/10;
	      }
	      if (n == sum)
	         System.out.println("Armstrong number.");
	      else
	         System.out.println("Not an Armstrong number.");   
		}
	   public static int power(int n, int r) 
	   {
	      int c, b = 1;
	      for (c = 1; c <= r; c++) 
	         b = b*n;
	      return b;   
	   }
}