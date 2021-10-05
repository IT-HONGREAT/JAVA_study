public class ForEach {
    public static void main(String[] args){
//        일반적인 배열생성
        int[] intArray1 = new int[100];
        for (int i = 0; i < 100; i++){
            intArray1[i] = i + 1;
            System.out.print("첫번째"+intArray1[i]);
        }
        System.out.println("");
//        같지만 조금더 직관적인 코드
        int[] intArray2 = new int[100];
        for (int i = 0; i < intArray2.length; i++){
            intArray2[i] = i + 1;
            System.out.print("두번째"+intArray2[i]);
        }

        System.out.println("");


        for (int i : intArray1){
            System.out.print("for-each 문법사용 : "+ i + " ");
        }
        System.out.println("");

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

//        test라고 변수를 설정해주고, 변수 : 배열 식으로 작성하면된다.
        for (String test : fruitsArray) {
            System.out.println("for-each 문법사용 : "+test);
        }




    }
}
