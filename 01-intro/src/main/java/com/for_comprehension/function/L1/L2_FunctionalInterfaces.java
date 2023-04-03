package com.for_comprehension.function.L1;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class L2_FunctionalInterfaces {

    public static void main(String[] args) {
        MyFunction foo = a -> "";
    }

    public static void functionalInterfaces() {
        Function<String, Integer> f1 = s -> Integer.parseInt(s);

        // Function<String, Void>
        Consumer<String> f2 = v -> System.out.println(v);
        // Function<Void, String>
        Supplier<String> f3 = () -> "foo";

        // Function<Integer, Boolean>
        Predicate<Integer> f4 = i -> i % 2 == 0;
        // Function<Integer, Integer
        UnaryOperator<Integer> f5 = i -> i + 1;

        // Function<Void, String>
        Callable<Integer> f6 = () -> 42;
        // Function<Void, Void>
        Runnable f7 = () -> {};

        BiFunction<String, String, Integer> f8 = (s, s2) -> Integer.parseInt(s + s2);
        // BiFunction<String, String, String
        BinaryOperator<String> f9 = (s, s2) -> s + s2;

        // currying
        Function<String, Function<String, Integer>> f10 = s -> s2 -> Integer.parseInt(s + s2);

        TriFunction<Integer, Integer, Integer, String> f11 = (i1, i2, i3) -> String.valueOf(i1 + i2 + i3);
    }

    @FunctionalInterface
    public interface TriFunction<T1, T2, T3, R> {
        R apply(T1 t1, T2 t2, T3 t3);
    }

    @FunctionalInterface
    public interface MyFunction {
        String apply(int a);
        default String apply2(int a) {
            return apply(a);
        }
    }

}

