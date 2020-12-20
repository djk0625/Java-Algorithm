package Chapter01;

import java.util.Scanner;

public class Chapter01A {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
			
	int a,b;
	
	a = scanner.nextInt();
	b = scanner.nextInt();
	
	if(a > b)
	{
		System.out.println(a);
	}
	else 
	{
		System.out.println(b);
	}
}
	}
