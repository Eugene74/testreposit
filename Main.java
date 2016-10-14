package test;

public class Main {
    public static void main(String [] args) {
        Boolean b = true;
        int i = 10;
        String str = "Hello World";
        assert (b == true) : "true";
        assert (i != 10) : "false";
        System.out.println(str);
    }
}