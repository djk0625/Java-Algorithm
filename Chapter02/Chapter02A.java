package Chapter02;

import java.util.Scanner;

public class Chapter02A {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int a = scanner.nextInt();
		int b[] = new int[a];
		int c[] = new int[a];
		int answer = -1;
		
		for(int i= 0; i < a; i++)
		{
			b[i] = scanner.nextInt();
		}
		
		for(int i= 0; i < a; i++)
		{
			c[i] = scanner.nextInt();
		}
		
		int d = scanner.nextInt();

		for(int i=a-1; i >= 0; i--)
		{
			if(d == c[i])
			{
				answer = b[i];
				break;
			}
		}
		System.out.print(answer);
	}

}

