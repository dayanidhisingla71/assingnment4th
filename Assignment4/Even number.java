package assignment3;
import java.util.Scanner;
public class Even {
	public static void main(String [] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of even numbers :- ");
		n=sc.nextInt();
		sc.close();
		for(int i=0;i<=n;i++)
			{if(i%2==0)
				System.out.println(+i);}
			}

}