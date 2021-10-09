public class multiArray {
    public static void main(String[] args) {
//        다중배열을 구현해보는 연습

//        배열의 초기값을 바로 생성
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(multiArray[0][0]);
//        자바스타일로 배열 multiArray2을 선언만 해주기
//        내부에 숫자는 넣어 주지 않았기 때문에, 전부 0이 들어가 있다.
        int[][] multiArray2 = new int[3][4];
        System.out.println(multiArray2[0][0]);


        System.out.println("===============================");
//        한칸 행에 대해서만 반복문을 사용해서 값을 넣고, 탐색
        for (int i = 0; i < multiArray[0].length; i++) {
            multiArray[0][i] = 1 + i;
            System.out.println("multiArray[0][i] : " + multiArray[0][i]);
        }
        for (int i = 0; i < multiArray[1].length; i++) {
            multiArray[1][i] = 5 + i;
            System.out.println("multiArray[1][i] : " + multiArray[1][i]);
        }
        for (int i = 0; i < multiArray[2].length; i++) {
            multiArray[2][i] = 9 + i;
            System.out.println("multiArray[2][i] : " + multiArray[2][i]);
        }
        System.out.println("===============================");
//       위의 반복문을 중첩(Nested Loops)으로 사용
        System.out.println("완성된배열출력!");
        int[][] NestedArray = new int[3][4];
        for (int i = 0;i < NestedArray.length;i++){
            for (int j = 0;j < NestedArray[i].length;j++){
                NestedArray[i][j] = (i * 4 + 1)+j;
                System.out.print("NestedArray[i][j] : "+NestedArray[i][j]+" ");
            }
            System.out.println();
        }



    }
}
