package com.for_comprehension.function.L1;

import java.util.Optional;

public class L3_Monad {

    public static void main(String[] args) {
        // declarative (with monads)
        Optional<String> user = findUserById(42);
        String s1 = user
            .map(s -> s.toUpperCase())
            .map(s -> s + "asdaskldj")
            .orElse("default");

        // imperative
        String user1 = findUserById(42).get();
        String result;
        if (user1 != null) {
            String upperCased = user1.toUpperCase();
            if (upperCased != null) {
                String withAsda = upperCased + "asdaskldj";
                if (withAsda != null) {
                    result = withAsda;
                } else {
                    result = "default";
                }
            }
        }

    }

    public static Optional<String> findUserById(int i) {
        return Optional.of("Adam");
    }
}
