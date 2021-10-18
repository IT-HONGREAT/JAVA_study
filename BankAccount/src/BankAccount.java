public class BankAccount {
    int balance;
    Person owner;
    // 파라미터 : 입금할 액수(정수)
    // 리턴 : 성공여부(불린)

//    입금기능 입금액수/return:불린값 참/거짓
    boolean deposit(int amount){
        //입금할 금액이 음수이면 입금실패
        if (amount < 0 || owner.cashAmount < amount) {
            System.out.println("입금 실패입니다. 잔고 : " + amount + "원, 현금 : " + owner.cashAmount);
            return false;
        }
        balance += amount;
        owner.cashAmount -= amount;

        System.out.println(amount + "원 입금하였습니다. 잔고 : " + amount + "원, 현금 : " + owner.cashAmount);

        return true;
    }
//    출금기능 출금액수/return:불린값 참/거짓
    boolean withdraw(int amount){
        if (amount < 0 || balance < amount){
            System.out.println("입금 실패입니다. 잔고 : " + amount + "원, 현금 : " + owner.cashAmount);
            return false;

        }
        balance -= amount;
        owner.cashAmount += amount;

        System.out.println(amount + "원 출금하였습니다. 잔고 : " + amount + "원, 현금 : " + owner.cashAmount);

        return true;
    }
//    이체기능 변수 2개
    //받는사람, 이체할 금액/return:불린값 참/거짓
//    boolean transfer(Person to, int amount){
//
//    }

}
