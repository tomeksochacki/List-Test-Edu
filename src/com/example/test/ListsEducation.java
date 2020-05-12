package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class ListsEducation {
    public static void main(String[] args) {

        List<Product> myList = new ArrayList<>();

        myList.add(new Product("Masło"));
        myList.add(new Product("Piwko"));
        myList.add(new Product("Chleb"));

        System.out.println(myList);

        removeButter(myList);

        System.out.println(myList);

        System.out.println(myList.size());
    }

    private static void removeButter(List<Product> myList) {
        Product butter = new Product("Masło");
        myList.remove(butter);
    }
}

