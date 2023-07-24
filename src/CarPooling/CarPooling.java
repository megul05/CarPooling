package CarPooling;

import java.util.Scanner;

public class CarPooling {
	
	public static boolean pool(int[][] arr,int capacity,int rows,int cols)
	{
		int res =0;
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<cols;i++)
			{
				res = arr[0][0] + arr[1][0];
				if( res == capacity)
				{
					return true;
				}	
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				 arr[i][j] = scan.nextInt();
			}
		}
		int capacity = scan.nextInt();
		 boolean res =pool(arr,capacity,rows,cols);
		 System.out.println(res);
		
	}

}
