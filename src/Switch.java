public class Switch {
    public static void main(String[] args) {

        int score = 6;

        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println(grade);

        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("좋은 점수다");
                break;
            case "C":
            case "D":
                System.out.println("공부안하고 놀았다");
                break;
            case "F":
                System.out.println("반성해야한다");

            default:
                System.out.println("재수강필수");
                break;
        }
        int number = 134354;
        String answer;

        switch (number % 7){
            case 1:
                answer= "One";
                break;
            case 2:
                answer= "Two";
                break;
            case 3:
                answer= "Three";
                break;
            case 4:
                answer= "Four";
                break;
            case 5:
                answer= "Five";
                break;
            case 6:
                answer= "Six";
                break;
            default:
                answer="Zero";
                        break;


        }
        System.out.println(answer);

    }
}
