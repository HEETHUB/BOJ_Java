package Silver;

import java.util.Scanner;

public class silver3_1003피보나치함수 {
	static int cnt0;
	static int cnt1;
	
	public static int fibo(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		if (n == 0) {
			cnt0++;
			return 0;
		}
		else if (n == 1) {
			cnt1++;
			return 1;
		}
		else return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t=0; t<T; t++) {
			int n = sc.nextInt();
			cnt0 = 0;
			cnt1 = 0;
			fibo(n);
			System.out.println(cnt0+" "+cnt1);
		}
	}
}
