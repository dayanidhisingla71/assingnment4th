package assignment3;
import java.util.Scanner;
public class Reverse {
public static void main(String [] args) {
	int n;
	Scanner sc=new Scanner(System.in);
			System.out.print("Enter no. of elements you want in array");
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.print("Enter elements");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			sc.close();
			for(int i=n-1;i<n;i--)
				System.out.print(+a[i]);
		
}
}