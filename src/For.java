public class For {
    public static void main(String[] args){

//        1~10 까지 더해보는 반복문
       int sum = 0;
       for (int i = 1; i <= 10; i++){
           sum += i;
       }
       System.out.println(sum);


        int check = 0;
        for (int i = 1; i <= 10; i+=2){
            check += i;
            System.out.println("i : "+i);
        }
//       for문의 구성요소는 (초기화식;종결제어식;증감제어식;) 이다.
//         초기화식은 초기 시작점 세팅, 종결제어식은 범위세팅, 증감제어식은 step의 개념이다.
        System.out.println(check);

//        1~100 합 더해보기
        int hundred = 0;
        for (int i = 1; i<= 100; i++){
            hundred += i;
        }
        System.out.println("1~100 합 : "+hundred);
//        신기한점: 문자열에서 '' 는 에러가 발생하기 때문에, " " 를 사용함..

//        구구단은 기본으로 만들 수 있어야지~!
//        int gob;
        for (int number = 1;number<=9;number++){
            for (int number2 = 1;number2<=9;number2++){
//                gob = number * number2;
//                System.out.print(number+" * ");
//                System.out.print(number2+" = ");
//                System.out.println(gob);
                System.out.println(number+" * "+number2+" = "+(number*number2));
//          출력문을 정제하면서, gob 변수도 필요없어졌다.

            }

        }

    }
}
