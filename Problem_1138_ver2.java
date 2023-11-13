import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
    1. 사이트 : 백준
    2. 문제 번호 : 1138
    3. 유형 : 구현
    4. 구현과정

    - 제일 마지막부터 List를 통한 index 배열을 넣어서 구현

    input
    4
    2 1 1 0

    제일 마지막 배열부터 시작.
    arr1[3] = 0 => list1.add(3+1,0) => {4}
    arr1[2] = 1 => list1.add(2+1,1) => {4,3}
    arr1[1] = 1 => list1.add(1+1,1) => {4,2,3}
    arr1[0] = 2 => list1.add(0+1,2) => {4,2,1,3}

    list.add를 사용하게 되면 간단하게 구현이 가능하다.
 */
public class Problem_1138_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(str.nextToken());
        int[] per = new int[N+1];
        List<Integer> place = new ArrayList<>();

        str = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= N; i++) {
            per[i] = Integer.parseInt(str.nextToken());
        }

        for(int i=N;i>=1;i--){
            place.add(per[i],i);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(place.get(i));
            if (i != N - 1) System.out.print(" ");
        }
    }
}
