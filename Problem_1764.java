import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
public class Problem_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        HashMap<String,Integer> list = new HashMap<>();
        List<String> saySeeperson = new ArrayList<>();

        for(int i=0;i<N;i++){
            str = new StringTokenizer(br.readLine());
            String sayName = str.nextToken();
            list.put(sayName,1);
        }
        for(int i=0;i<M;i++){
            str = new StringTokenizer(br.readLine());
            String seeName = str.nextToken();

            if(list.containsKey(seeName)==true){
                list.put(seeName,list.get(seeName)+1);
            }
            else list.put(seeName,1);
        }

        for( String strValue : list.keySet() ){
            Integer strKey = list.get(strValue);
            if(strKey==2) saySeeperson.add(strValue);
        }
        saySeeperson = saySeeperson.stream().sorted().collect(Collectors.toList());

        System.out.println(saySeeperson.size());

        for(String person : saySeeperson){
            System.out.println(person);
        }
    }
}
