import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
