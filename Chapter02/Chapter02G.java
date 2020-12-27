package Chapter02;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter02G {
	public static final Scanner scanner = new Scanner(System.in);

	public static void bubbleSort(int[] data, int n)
	{
		for(int i = 0 ; i < n ; i++)
		{
            for(int j = 0; j < n-1-i; j++)  // 시간 복잡도를 고려하여, 안한 부분만 탐색 할 수 있게, i값을 빼주었습니다.
            {
                if(data[j] > data[j+1])
                {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
		}
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int data[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			data[i] = scanner.nextInt();
		}

		bubbleSort(data, n);

		for(int i = 0 ; i < n ; i++)
		{
			if( i > 0 )
			{
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
	}

}
