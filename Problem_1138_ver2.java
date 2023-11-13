import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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
