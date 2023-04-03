package com.for_comprehension.function.L1;

public class L1_LambdaAnatomy {

    /*

    (T1 a, T2 b) -> {
        return 42;
    }

    (a, b) -> 42

    a -> 42

    () -> 42

    s -> s.toUpperCase()
    String::toUpperCase





     */
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello!"));
    }

}
