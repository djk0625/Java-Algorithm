package Chapter01;

import java.util.Scanner;

public class Chapter01B {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int max = 0;
		
		for(int i = 0; i < n; i++)
		{
			int t = scanner.nextInt();
			if( i == 0)
			{
				max = t;
			}
			else if( t > max)
			{
				max = t;
			}
		}
	System.out.println(max);
	}

}
