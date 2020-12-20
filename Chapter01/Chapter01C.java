package Chapter01;

import java.util.Scanner;

public class Chapter01C {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		int count=0;
		
		for(int i = 0; i < n; i++)
		{
			int t = scanner.nextInt();
			if(m == t || s == t)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}