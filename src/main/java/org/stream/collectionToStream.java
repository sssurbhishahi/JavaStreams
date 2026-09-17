package org.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class collectionToStream {
    public static void main(String[] args) {

        Set<String> dataSet= new HashSet<>();
        dataSet.add("were");
        dataSet.add("pooja");
        dataSet.stream().forEach(System.out::println);
        System.out.println("checking the print working or not");

        Map<String,Integer> dataMap = new HashMap<>();
        dataMap.put("Sahara",1);
        dataMap.put("Gobhi",2);
        dataMap.put("Thar",3);
        dataMap.entrySet().stream().forEach(System.out::println);
        dataMap.values().stream().forEach(System.out::println);

        String[] srArr= {"pooja","pamila","sunita"};
        Stream<String>stringStream = Stream.of(srArr);
        stringStream.forEach(System.out::println);
    }
}
