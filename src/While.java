public class While {
    public static void main(String[] args) {

        int limit = 10000;
        int i = 1;
        int answer = 0;

        while (i < limit) {
            if (i % 153 == 0) {
//                System.out.println(i);
                answer = i;
            }
            i++;

        }
        System.out.println(answer);
    }
}
