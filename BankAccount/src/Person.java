public class Person {
    String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge()  {
        return age;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public  void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }
    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount newAccount){
        account = newAccount;
    }

}
