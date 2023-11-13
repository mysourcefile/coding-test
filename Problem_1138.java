import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    1. 사이트 : 백준
    2. 문제 번호 : 1138
    3. 유형 : 구현
    4. 구현과정

    1) 키 순서를 가지고 있는 배열과 순서를 배치하는 배열을 선언한다.
    2) 키 순서를 가지고 있는 배열을 루프 돌리면서 순서를 배치하는 공간에 빈칸이 있는 지 확인한다.
    3) 빈칸이 있으면 순서를 배열안에 넣는다
    4) 빈칸이 없으면 다음 순서를 확인해서 빈칸이 있는 곳에 넣는다.

    input
    4
    2 1 1 0

    - arr1[4]={2,1,1,0} , arr2[4]
    - arr1[0] = 2 => arr2[2] -> 빈칸이 있는 지 확인
    - arr1[1] = 1 => arr2[1] -> 빈칸이 있는 지 확인
    - arr2[2] = 1 => arr2[1] -> 빈칸이 있는 지 확인 -> 빈칸이 없음 -> 다음 순서 확인 -> 빈칸이 있으면 넣기
    - arr2[3] = 0 => arr2[0] -> 빈칸이 있는 지 확인

 */
public class Problem_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(str.nextToken());
        int[] per = new int[N];
        int[] place = new int[N];

        str = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            per[i] = Integer.parseInt(str.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (cnt == per[i] && place[j] == 0) {
                    place[j] = i + 1;
                    break;
                }
                if (place[j] == 0 || place[j] == i + 1) {
                    cnt++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(place[i]);
            if (i != N - 1) System.out.print(" ");
        }
    }
}
