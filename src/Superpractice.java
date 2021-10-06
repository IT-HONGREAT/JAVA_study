class SuperClass {
        SuperClass(){
            System.out.print("Super");
            System.out.println("test3");
        }
}
class SubClass extends SuperClass{
    SubClass(){
        System.out.print("Sub");
        System.out.println("test");
        System.out.println("test2");
    }
}
class SuperSub{
    public static void main(String[] args){
        SuperClass s = new SubClass();
        SuperClass n = new SubClass();
    }
}
