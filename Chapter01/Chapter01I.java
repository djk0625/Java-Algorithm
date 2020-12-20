package Chapter01;

import java.util.Scanner;

//Selection Sort
public class Chapter01I {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] data = new int[n];
		int least;
		
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		for(int i = 0; i < n-1; i++)
		{
			least = i;
			
			for(int j = i+1; j < n; j++)
			{
				if(data[j] < data[least])
				{
					least = j;
				}
			}
			
			int temp = data[i];
			data[i] = data[least];
			data[least] = temp;
	}
		
		for(int i = 0; i < n; i++)
		{
			if(i > 0)
			{
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
	}
}

