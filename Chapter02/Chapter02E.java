package Chapter02;

import java.util.Scanner;

public class Chapter02E {
    public static final Scanner scanner = new Scanner(System.in);
	
    public static boolean number(int N)
    {
		if( N == 1)
			return false;
		else if( N == 2 )
			return true;
		else if( N % 2 == 0)
			return false;

        for(int i = 3; i * i <= N; i+=2)
        {  
            if( N % i == 0 )
            { 
                return false;
            }
        }
			
        return true;
    }

    public static void testCase(int i)
    {
        int n = scanner.nextInt();
        boolean result = number(n);

        System.out.println("Case #" + i);
        if(result)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            testCase(i);
        }
    }

}