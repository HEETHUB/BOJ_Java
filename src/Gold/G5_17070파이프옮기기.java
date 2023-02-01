package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_17070파이프옮기기 {
	static int cnt = 0;
	static int N;
	static int[][] room;
	
	public static void findPath(int r, int c, int dir) {
		if (r==N-1&&c==N-1) {
			cnt++;
		} else {
			if (dir == 0&&c+1<N&&room[r][c+1]==0) {
				if (r+1<N&&room[r+1][c+1]==0&&room[r+1][c]==0) 
					findPath(r+1, c+1, dir+1);
				findPath(r, c+1, dir);
			} else if (dir == 1) {
				if(c+1<N&&room[r][c+1]==0) 
					findPath(r,c+1,dir-1);
				if (r+1<N&&room[r+1][c]==0) 
					findPath(r+1,c,dir+1);
				if (r+1<N&&c+1<N&&room[r+1][c+1]==0&&room[r+1][c]==0&&room[r][c+1]==0) 
					findPath(r+1,c+1,dir);
			} else if (dir==2&&r+1<N&&room[r+1][c]==0) {
				if (c+1<N&&room[r+1][c+1]==0&&room[r][c+1]==0) 
					findPath(r+1,c+1,dir-1);
				findPath(r+1,c,dir);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		room = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 방향이 가로라면 (0,+1) or (+1,+1)
		// 방향이 세로라면 (+1,0) or (+1, +1)
		// 방향이 대각이라면 (+1,+1), (+1,0), (0,+1)
		findPath(0, 1, 0);
		System.out.println(cnt);
	}
}
