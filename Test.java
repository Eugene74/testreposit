package test;


class Super {
    Super() {
        System.out.println("Super contructor");
    }
}

public class Test extends Super {
    Test() {
        this(1);
        System.out.println("Main() contructor");
        System.out.println("Main() contructor1");
    }
    Test(int i) {
        System.out.println("Main(int) contructor");
    }
    public static void main(String [] args) {
        new Test();
    }
}