package com.polaris.alertLayoutDesign.action;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int[] arr = {3,5,7,8,2,1,9,5,3,5,7,8,2,1,9,5,3,5,7,8,2,1,9,5};
		int findNo;
		Scanner obj = new Scanner(System.in);
		findNo=obj.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==findNo)
			{
				System.out.println("Number "+arr[i]+" present in this index :"+i);
				break;
			}
					
		}
		

	}

}
