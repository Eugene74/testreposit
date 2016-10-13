package test;

import java.util.Arrays;

class Generic<T extends Number> {
    private T arr[] ;

    public String toString(){
        return Arrays.toString(arr);
    }
}

public class Main {
    public static void main(String [] args) {
        Generic<Double> obj = new Generic<Double>();
        System.out.println(obj);
    }
}