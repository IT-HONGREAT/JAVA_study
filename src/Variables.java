public class Variables {
    public static void main(String[] args) {
        int age;
        age = 27;

        //int num = 21; 변수선언과 저장을 동시에 수행 가능하다

        int man_age = age-1;     //변수에 변수저장

        //age = 22.6;  x 소수라서 에러가 뜬다.
        //age += 1 ;   //이것도 가능하네!


        System.out.print("Hello, i'm ");  //그냥 print는 줄바꿈이 안되고
        System.out.println(age);          //println 은 줄바꿈이된다.!!
        System.out.println("만 나이는 아마도");
        System.out.print(man_age);
        System.out.println("살??");

        //boolean 은 불린자료형이고
        // int는 정수이고 2^-(31)~2^(31)의 범위를 가진다,long는 int 범위 외의 큰 값이다.
        // double는 소수형이다.

        boolean check_bool  = true;

        int check_int = 123;

        long check_long = 12345678910L;

        double check_double = 3.141592;

        System.out.println(check_bool);
        System.out.println(check_int);
        System.out.println(check_long);
        System.out.println(check_double);
    }
}
