package Chapter01;

import java.util.Scanner;

public class Chapter01D {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int a[] = new int[n];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			answer += a[i];
		}
		System.out.println(answer);
	}

}
