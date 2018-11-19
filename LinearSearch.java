package exeprograms;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[])
	{
		int arr[]= {10,11,12,13};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to search :");
		int sele=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(sele==arr[i])
			{
				System.out.println(arr[i]+" elementt found in position : "+(i+1));
			}
			
			else
			{
				System.out.println(sele +" element not there");
			}
			
		}
				
	}

}
