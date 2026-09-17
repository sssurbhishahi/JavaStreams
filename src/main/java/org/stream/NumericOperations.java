package org.stream;

import java.util.Comparator;
import java.util.List;

public class NumericOperations {
    public static void main(String[] args) {
        List<Integer> numList = List.of(2,3,4,12,45);
        int max=  numList.stream().mapToInt(b->(int)b).max().getAsInt();
        System.out.println(max);
        int min =numList.stream().mapToInt(v->(int)v).min().getAsInt();
        System.out.println(min);

        //second smallest
        int secSmall=  numList.stream().mapToInt(x->(int)x).sorted().skip(1).findFirst().getAsInt();
        System.out.println(secSmall);
        //second largest
        int secondLargest= numList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest+" is second largest");
        int number = 12345;
        int sumofDigits= String.valueOf(number).chars().map((ch)->Character.getNumericValue(ch)).sum();
        System.out.println(sumofDigits+" : is sum of sumofDigits");
    }
}
