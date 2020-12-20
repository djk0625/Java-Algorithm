package Chapter01;

import java.util.Scanner;

public class Chapter01F {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int t[] = new int[n];
		
		int answer = -1;
		
		for(int i=0; i < n; i++)
		{
			t[i] = scanner.nextInt();
		}
			
		for(int i = 0; i < n; i++)
		{
			if(t[i] == m)
			{
				answer = i;
			}
		}
					System.out.println(answer);
	}
}

