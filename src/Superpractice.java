class SuperClass {
        SuperClass(){
            System.out.print("Super");
        }
}
class SubClass extends SuperClass{
    SubClass(){
        System.out.print("Sub");
    }
}
class SuperSub{
    public static void main(String[] args){
        SuperClass s = new SubClass();
    }
}
