package Chapter02;

import java.util.Scanner;

public class Chapter02D {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String a = scanner.next();
		String b = scanner.next();
		
		int result = a.compareTo(b);
		
		if(result < 0)
		{
			System.out.print("-1");
		}
		else if(result == 0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.print("1");
		}
	}
}