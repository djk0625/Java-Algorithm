package Chapter01;

import java.util.Scanner;

public class Chapter01E {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int answer = 0;
		int sum = 0;
		int data[] = new int[a];
		
		for(int i=0; i < a; i++)
		{
			data[i] = scanner.nextInt();
			if(data[i] <= b)
			{
				answer += 1;
				sum += data[i];
			}
		}
				System.out.printf("%d %d\n", answer, sum);
			if(sum <= c)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
}
