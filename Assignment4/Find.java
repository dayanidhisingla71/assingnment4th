package assignment3;
import java.util.Scanner;
public class Find {
		public static void main(String args[])
		{
			int arr[] = new int[7];
			arr[0]=1;
			arr[1]=4;
			arr[2]=6;
			arr[3]=7;
			arr[4]=8;
			arr[5]=9;
			arr[6]=10;
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			if(a > arr[6] || a < arr[0])
			{
				System.out.println("Not in Array");
			}
			else if(a == arr[6])
			{
				System.out.println("Found at 6");
			}
			else
			{
				for(int i = 0 ; i < 6 ; i++)
				{
					if(arr[i] == a)
					{
						System.out.println("Found at "+i);
						break;
					}
					else if(arr[i] > a)
					{
						System.out.println("Not Found");
						break;
					}
				}
			}
		}
	

}