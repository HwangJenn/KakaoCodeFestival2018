//카카오프렌즈 스토어에서는 N종류의 인형을 팔고 있다. N개의 인형들 중에서는 잘 팔리는 인형과 그렇지 않은 인형들이 섞여 있어서 잘 팔리는 인형은 상대적으로 사람들이 많이 볼 수 있는 곳에 배치하고, 잘 팔리지 않는 인형은 상대적으로 사람들이 적게 볼 수 있는 곳에 배치한다. 그러므로 배치된 곳이 가까운 두 인형은 상대적으로 판매량이 비슷하다고 할 수 있다.
//
//좋은 배치를 정하기 위해서 어느 날, 여러 명의 사람들을 대상으로 인형의 선호도를 조사하였다. 조사 결과 각 인형에 대해서 선호하는 사람의 수를 모두 구하였고, 그에 따라 인형의 배치를 정하려고 한다.
//
//카카오프렌즈 스토어를 관리하는 브라이언은 어떠한 특정한 곳에 인형들을 배치하고자 하는데, 그곳에 인형들을 선택하는 방법은 다음과 같다:
//
//먼저 비슷한 인형이 가깝게 위치하도록 서로 다른 N개의 인형을 종류당 한 개씩 일렬로 배치한다.
//그 후, 선호하는 사람의 수의 표준편차가 최소가 되는, K개 이상의 연속된 위치에 있는 인형들을 선택하여 그들을 같은 곳에 배치한다.
//위의 방법으로 인형들을 선택했을 때, 선택된 인형들의 선호하는 사람의 수의 표준편차를 구하여라.
//
//N개의 수 a1, a2, …, aN이 주어져 있을 때, 통계학에서 (산술) 평균은 (a1 + a2 + … + aN) / N 으로 정의한다. 이를 m으로 정의하자. 또한, 분산은 ((a1 - m)2 + (a2 - m)2 + … + (aN - m)2) / N으로 정의하고, 표준 편차는 분산의 음이 아닌 제곱근으로 정의한다.
import java.util.*;
public class B_인형들_15954 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        double count;
        double min = Double.MAX_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        } for(int i=k; i<n; i++){
            for(int index=0; index<=n-i; index++){
                count = solution(arr, index, i);
                if(min>count)
                    min = count;
            }
    } System.out.println(String.format("%.11f", min));
} public static double solution(int[] arr, int count, int k){
    double sum = 0;
    double m;
    double result = 0;

    for(int i= count; i<count+k; i++){
    sum+=arr[i];
    }
    m = sum/k;
    for(int i=count; i<count+k; i++){
        result += Math.pow((arr[i]-m),2);
    } result = Math.sqrt(result/k);
    return  result;
    }
}
