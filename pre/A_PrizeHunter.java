//제이지는 자신이 코드 페스티벌에 출전하여 받을 수 있을 상금이 얼마인지 궁금해졌다. 그는 자신이 두 번의 코드 페스티벌 본선 대회에서 얻을 수 있을 총 상금이 얼마인지 알아보기 위해, 상상력을 발휘하여 아래와 같은 가정을 하였다.
//제1회 코드 페스티벌 본선에 진출하여 a등(1 ≤ a ≤ 100)등을 하였다. 단, 진출하지 못했다면 a = 0으로 둔다.
//제2회 코드 페스티벌 본선에 진출하여 b등(1 ≤ b ≤ 64)등을 할 것이다. 단, 진출하지 못했다면 b = 0으로 둔다.
//제이지는 이러한 가정에 따라, 자신이 받을 수 있는 총 상금이 얼마인지를 알고 싶어한다.
import java.util.*;
public class A_PrizeHunter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++){
            int first = scan.nextInt();
            int second = scan.nextInt();
            System.out.print(a(first)+b(second));
        }
    } public static int a(int first) {
        if(first == 1)
            return 5000000;
        else if(2<=first && first<=3)
            return 3000000;
        else if(4<=first && first<=6)
            return 2000000;
        else if(7<=first && first<=10)
            return 500000;
        else if(11<=first && first<=15)
            return 300000;
        else if(16<=first && first<=21)
            return 100000;
        else return 0;
    } public static int b(int second) {
        if(second == 1)
            return 5120000;
        else if(2<=second && second<=3)
            return 2560000;
        else if(4<=second && second<=7)
            return 1280000;
        else if(8<=second && second<=15)
            return 640000;
        else if(16<=second && second<=31)
            return 320000;
        else return 0;
    }
}