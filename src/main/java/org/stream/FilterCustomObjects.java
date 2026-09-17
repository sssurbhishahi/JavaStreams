package org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}

public class FilterCustomObjects {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("TV",200000,"electronics"));
        productList.add(new Product("phone",100000,"electronics"));
        productList.add(new Product("bucket",200,"dailychore"));
        productList.add(new Product("icecream",200000,"food"));
      List<Product> filteredProducts=  productList.stream().filter(x->x.getCategory().equalsIgnoreCase("electronics")).collect(Collectors.toList());

        System.out.println(filteredProducts);
    }
}
