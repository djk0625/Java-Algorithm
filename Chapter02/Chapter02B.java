package Chapter02;

import java.util.Scanner;

public class Chapter02B {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int data[] = new int[n];
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			data[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<n-1; i++)
		{
			if(data[i] > data[i+1])
			{
				count++;
			}
		}

		if(count == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}
