package org.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEveryStringSentence {
    public static void main(String[] args) {
        String str = "Hello this is my new reality";
        System.out.println(Stream.of(str.split(" ")).map(x->new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" ")));
    }
}
