public class BankDriver {
    public static void main(String[] args) {
        // p1 선언
        Person p1 =new Person();
        p1.name = "첫고객";
//        p1.age = 27;
        p1.setAge(20);
        p1.cashAmount = 100;

        // p2 선언
        Person p2 = new Person();
        p2.name = "홍인영";
//        p2.age = 27;
        p2.setAge(27);
        p2.cashAmount = 100000;


        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 1000;

        p1.account = a1;
        a1.owner = p1;

        System.out.println(p1.account.balance);
        System.out.println(a1.owner.name);

        // p2계좌 생성
        BankAccount a2 = new BankAccount();
        a2.balance = 500000;
        //연결
        p1.account = a2;
        a2.owner = p2;


        //입출금해보기
        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

    }}
