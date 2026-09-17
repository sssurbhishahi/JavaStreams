package org.stream;

import java.util.Arrays;
import java.util.List;

public class NumericOpsUsingStream {
    //find average - which would be double most probably !!!



    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(3,45,5,23,43);
       Double average= numList.stream().mapToInt(n->n.intValue())
                .average().getAsDouble();
        System.out.println(
                average
        );
    }
}
