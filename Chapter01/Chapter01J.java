package Chapter01;

import java.util.Scanner;

public class Chapter01J {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int sum = 0;
		int answer = 0;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
		{
			sum += j;
		}
	}
		answer = sum;
		System.out.println(answer);
	}

}
