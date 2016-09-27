package test;


public class Test2 {
    public static boolean methodOne() {
        System.out.println("methodOne ");
        return false;
    }

    public static boolean methodTwo() {
        System.out.println("methodTwo ");
        return true;
    }

    public static boolean methodThree() {
        System.out.println("methodThree ");
        return true;
    }

    public static void main(String[] args){
        System.out.println(Test2.methodOne() || Test2.methodTwo() || Test2.methodThree());
    }
}