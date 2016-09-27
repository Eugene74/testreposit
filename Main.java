package test;



public class Main {



    public static void main(String[] s) {
        for (int i = 2; i < 10; i = (i++) + i--, i++) {
            System.out.print(--i);
        }
    }
}