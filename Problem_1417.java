import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int dasom = Integer.parseInt(bf.readLine());
        int[] arr = new int[N-1];
        if(N==1)
        {
            System.out.println(0);
            return;
        }
        for(int i=0;i<N-1;i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        int cnt = 0;
        while(true){
            Arrays.sort(arr);
            boolean flag = true;
            int last = arr.length-1;
            if(dasom <= arr[arr.length-1]){
                dasom++;
                arr[last] --;
                cnt++;
                flag = false;
            }
            if(flag)
                break;
        }
        System.out.println(cnt);
    }
}
