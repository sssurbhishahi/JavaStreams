package org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapUsage {// map method alters every element of the collection
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString = List.of("1", "2", "3", "4");
        List<Integer> integerList = listString.stream().map(i -> Integer.valueOf(i)).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
