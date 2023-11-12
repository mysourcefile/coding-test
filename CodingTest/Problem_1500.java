package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1500 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        int[] arr = new int[K];
        int i = 0;
        long result = 1;
        while(S!=0) {
            arr[i] +=1;
            S-=1;
            if(i==arr.length-1)i=0;
            else i++;
        }

        for(int j=0;j<arr.length;j++){
            result *= arr[j];
        }
        System.out.println(result);
    }
}
