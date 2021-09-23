public class Operators {
    public static void main(String[] args){

        int a = 10;
        int b = 13;   //정수형일 때 나누기를 하면 정수형으로만 출력

        System.out.println(a +" + "+ b + " = " + (a + b));
        System.out.println(a +" - "+ b + " = " + (a - b));
        System.out.println(a +" * "+ b + " = " + (a * b));
        System.out.println(a +" / "+ b + " = " + (a / b));
        System.out.println(a +" % "+ b + " = " + (a % b));

        System.out.println("-------------");
        int c = 20;
        double d = 3;   //소수점 출력

        System.out.println(c +" + "+ d + " = " + (c + d));
        System.out.println(c +" - "+ d + " = " + (c - d));
        System.out.println(c +" * "+ d + " = " + (c * d));
        System.out.println(c +" / "+ d + " = " + (c / d));
        System.out.println(c +" % "+ d + " = " + (c % d));

        System.out.println("-------------");
        System.out.println("----형변환----");

        double x = 3.14;
        int y = (int)x;  //앞에 int를 써줘야한다. double이 더 크기 때문에..

        System.out.println(y);

        int e = 9;
        int f = 5;
        System.out.println("double 안쓰고 출력 : "+e/f);
        System.out.println("double 앞에 써줄 때 : "+(double) e/f);
    }
}
