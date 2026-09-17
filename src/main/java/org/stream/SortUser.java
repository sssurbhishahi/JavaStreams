package org.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User{
    private String name;
    private int age ;

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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SortUser {
    public static void main(String[] args) {
        List<User> lstUser= Arrays.asList(
                new User("Ramesh", 45),
                new User("Pooja", 32),
                new User("Swati", 41),
                new User("Ganesh", 25),
                new User("PAVI", 15)
        );
//        Comparator<User> userComparator = new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge()- o2.getAge();
//            }
//        };
        List<User> sortedList=lstUser.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
        System.out.println(sortedList);

        List<User> descendingList= lstUser.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).toList();
        System.out.println(descendingList);
    }
}
