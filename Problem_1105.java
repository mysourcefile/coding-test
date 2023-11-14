import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    1. 사이트 : 백준
    2. 문제 번호 : 1105
    3. 유형 : 수학, 그리디
    4. 구현과정

    1) 자리수를 확인한다. L보다 R이 자리수가 많으면 0
    2) 자리수가 같으면 첫번째부터 8이 있는 지 확인한다.
    3) 8이 있으면 count 없으면 break 한다

    input
    88 88

    - 8 count = 1;
    - 88 count = 2;

 */
public class Problem_1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());

        String strL = str.nextToken();
        String strR = str.nextToken();

        int result = 0;
        if(strL.length() == strR.length()){
            for(int i=0;i<strL.length();i++){
                if(strL.charAt(i) != strR.charAt(i)) {
                    break;
                }
                else {
                    if(strL.charAt(i) == '8') {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
/*
 아래는 처음 완탐을 시도로 해서 틀린 오답노트
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(bf.readLine());

        int L = Integer.parseInt(str.nextToken());
        int R = Integer.parseInt(str.nextToken());

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=L;i<=R;i++){
            String num = Integer.toString(i);
            int cnt = 0;
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)=='8') {
                    cnt += 1;
                }
            }
            result.add(cnt);
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result.get(0));
*/