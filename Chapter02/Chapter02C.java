package Chapter02;

import java.util.Scanner;

public class Chapter02C {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int data[] = new int[n];
		int answer = n;
		
		for(int i=0; i < n; i++)
		{
			data[i] = scanner.nextInt();
		}
		
		for(int i=0; i < n-1; i++)
		{
			if(data[i] == data[i+1])
			{
				answer--;
			}
		}
		System.out.print(answer);
	}

}
