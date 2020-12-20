package Chapter01;

import java.util.Scanner;

public class Chapter01G {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		String t[] = new String[n];
		
		int start = -1;
		int end = -1;
		
		for(int i=0; i < n; i++)
		{
			t[i] = scanner.next();
		}
		
		for(int a=0; a<n; a++)
		{
			if(t[a].equals("AJOU"))
			{
				start = a+1;
				break;
			}
		}
		
		for(int b = n-1; b >= 0; b--)
		{
			if(t[b].equals("AJOU"))
			{
				end = b+1;
				break;
			}
		}		
		System.out.print(start + " ");
		System.out.print(end);		
	}
}

