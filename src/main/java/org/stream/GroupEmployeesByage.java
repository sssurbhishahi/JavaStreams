package org.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupEmployeesByage {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Paka", 32),
                new Employee(2, "Pooja", 22),
                new Employee(1, "Amrita", 22),
                new Employee(1, "Tanha", 42),
                new Employee(1, "Kajol", 42));
        Map<Integer, List<Employee>> resMap =
                employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        resMap.forEach((k, v) -> {
                    System.out.println("Age " + k);
                    System.out.println("Group of employees " + v);
                }
        );

    }
}
