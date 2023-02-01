package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2535 {
	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();

	      int[][] arr = new int[N][3];

	      for (int i = 0; i < N; i++) {
	         int nationNumber = sc.nextInt();
	         int studentNumber = sc.nextInt();
	         int score = sc.nextInt();

	         arr[i][0] = nationNumber;
	         arr[i][1] = studentNumber;
	         arr[i][2] = score;

	      }
//	        int[][]
	      // 배열을 score 순으로 sorting하기.
	      for (int i = 0; i < N; i++) {
	         for (int j = i + 1; j < N; j++) {
	            if (arr[i][2] < arr[j][2]) {
	               int tmp_score = arr[i][2];
	               arr[i][2] = arr[j][2];
	               arr[j][2] = tmp_score;
	               int tmp_nationNumber = arr[i][0];
	               arr[i][0] = arr[j][0];
	               arr[j][0] = tmp_nationNumber;
	               int tmp_studentNumber = arr[i][1];
	               arr[i][1] = arr[j][1];
	               arr[j][1] = tmp_studentNumber;
	            }
	         }
	      }
	      System.out.println(Arrays.deepToString(arr));
	      // 한 국가에서 세개 받았을 경우 4등을 동메달로.
	      if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) {

	         System.out.printf("%d %d", arr[0][0], arr[0][1]);
	         System.out.println();
	         System.out.printf("%d %d", arr[1][0], arr[1][1]);
	         System.out.println();
	         System.out.printf("%d %d", arr[3][0], arr[3][1]);
	      }

	      else {

	         System.out.printf("%d %d", arr[0][0], arr[0][1]);
	         System.out.println();
	         System.out.printf("%d %d", arr[1][0], arr[1][1]);
	         System.out.println();
	         System.out.printf("%d %d", arr[2][0], arr[2][1]);

	      }
	   }

}
