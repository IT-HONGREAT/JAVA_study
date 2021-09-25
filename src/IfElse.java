public class IfElse {
    public static void main(String[] args){
        int temp = 29;

        if (temp <= 0) {
            System.out.println("영하의 온도");
        }else if (temp <= 15) {
            System.out.println("쌀쌀한 온도");
        }else if (temp <= 21) {
            System.out.println("시원한 온도");
        }else if (temp <= 26){
            System.out.println("쾌적한 온도");
        }else {
            System.out.println("더운 온도");
        }

        int number = 13;

        if (number % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

        System.out.println("=============");

        int a = 3;
        int b = 7;

        if (a == b){
            System.out.print("a와 b가 같습니다. a = b ="+a);
        }else if (a != b){
            System.out.println("a와 b는 같지 않습니다");
        }if (a > b){
            System.out.println("a가 b보다 "+(a-b)+"만큼 더 큽니다.");
        }if (a < b){
            System.out.println("b가 a보다 "+(b-a)+"만큼 더 큽니다");
        }

        System.out.println("=====위와 아래 코드 구동은 같다=====");


        if (a == b){
            System.out.print("a와 b가 같습니다. a = b ="+a);
        }else  {
            System.out.println("a와 b는 같지 않습니다");
        }   if (a > b){
            System.out.println("a가 b보다 "+(a-b)+"만큼 더 큽니다.");
        }       else {
            System.out.println("b가 a보다 "+(b-a)+"만큼 더 큽니다");
        }

    }

}
