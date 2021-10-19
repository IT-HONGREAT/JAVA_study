public class BankDriver {
    public static void main(String[] args) {
        // p1 선언
        Person p1 =new Person();

        p1.setName("첫고객");
        p1.setAge(20);
        p1.setCashAmount(100);

        // p2 선언
        Person p2 = new Person();
        p2.setName("홍인영");
        p2.setAge(27);
        p2.setCashAmount(10000);


        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.setBalance(10000);
        p1.setAccount(a1);
        a1.setOwner(p1);

        // p2계좌 생성
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);
        p2.setAccount(a2);
        a2.setOwner(p2);


        //입출금해보기
        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

    }}
