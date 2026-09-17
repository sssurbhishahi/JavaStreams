package org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingProductsExample {
    public static void main(String[] args) {
        List<Product> productList= new ArrayList<>();

        productList.add(new Product("TV",200000,"electronics"));
        productList.add(new Product("phone",100000,"electronics"));
        productList.add(new Product("bucket",200,"dailychore"));
        productList.add(new Product("icecream",200000,"food"));
        Map<String,List<Product>> groupedMap= productList.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(groupedMap);
    }
}
