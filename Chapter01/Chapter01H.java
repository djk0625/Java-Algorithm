package Chapter01;

import java.util.Scanner;

public class Chapter01H {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		int data[] = new int[n];
		int x = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			data[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			sum += data[i];
		}
		
		for(int i = 0; i < n; i++)
		{
			int a = Math.abs(n*data[x] - sum);
			int b = Math.abs(n*data[i] - sum);
			
			if(a > b)
			{
				x = i;
			}
		}
						System.out.print(x+1 + " ");			
						System.out.print(data[x]);
	}
}

