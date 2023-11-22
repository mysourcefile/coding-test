import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        List<Integer> person = new ArrayList<>();

        for(int i=0;i<M;i++)
        {
            person.add(Integer.parseInt(bf.readLine()));
        }
        person.sort(Comparator.reverseOrder());

        int egg = 0;
        if(N < person.size()) egg = N;
        else egg = person.size();

        int result = 0;
        int topProfit = 0;
        int topPrice = 0;

        for(int i=0;i<egg;i++){
            for(int j=0;j<person.size();j++){
                if(person.get(i) <= person.get(j))result+= person.get(i);
            }
            if(topProfit <= result){
                topProfit = result;
                topPrice = person.get(i);
            }
            result = 0;
        }
        System.out.println(topPrice + " " + topProfit);
    }
}