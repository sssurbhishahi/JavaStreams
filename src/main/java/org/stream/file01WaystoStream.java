package org.stream;
import java.util.*;
import java.util.stream.Stream;

public class file01WaystoStream {
    public static void main(String[] args) {
        //usage of peek
        List<String> strList = List.of("banana","papaya","mango");
        Stream<String> strStream = strList.stream();
      List<String> listP=strStream.peek(e-> System.out.println(e))
              .map(element->element.toUpperCase())
              .peek(element-> System.out.println("after map method"))
              .toList();

    }
}
