package org.stream;

import java.util.Comparator;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> lstString = List.of("Punjab", "Sindh", "Gujarat", "Maratha");
        List<String> resultAsc = lstString.stream()
                .sorted()
                .toList();
        System.out.println("resultAsc :" + resultAsc);
        List<String> resultDesc = lstString.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("resultDesc :" + resultDesc);
    }
}
