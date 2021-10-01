public class Array {
    public static void main(String[] args){
//        자바는 배열에 담을 속성(자료형)과 [크기]를 미리 정해야한다.
        int[] intArray = new int[5];
//          배열의 값을 정해주는데, 만약 값을 정해주지않으면, 기본적으로 0이 들어가 있는다.

//        배열길이함수는 .length
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
        System.out.println("=============");

//        배열의 인덱스에 값을 지정해준다. 0 -> 숫자값
        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
        System.out.println("=============");
//        다른방식으로도 만들 수 있다.
        int[] newintArray = {1,2,3,4,5};
        for (int i = 0; i < newintArray.length; i++) {
            System.out.println(newintArray[i]);

        }
        System.out.println("=============");
//        앨리어싱을 해볼건데 배열복사의 두가지 개념(깊은복사,옅은복사 개념과 같은 것 같다)이다.
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;
        arr1[0] = 100;

        System.out.println(arr2[0]);  // 같은 주소값을 같는 복사이다.

        System.out.println("=============");

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = arr3.clone();  // .clone메소드는 배열 복사 => 새로운 배열을 만드는 것이다.

        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);

        System.out.println("=============");


    }
}
