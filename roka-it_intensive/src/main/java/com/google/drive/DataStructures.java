package com.google.drive;

import java.util.*;

public class DataStructures {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list2.add("qwe");
        list2.add("qwe");
        list2.add("qwe");
        list.add("qwe");
        list2.add("asd");
        list.add("asd");
        list.add("asd");
        list.add("asd");
        list.add("asd");
        list.remove(2);
        boolean rty = list.contains("rty");

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list2);
        System.out.println(list2.get(1));

        Set<String> set = new HashSet<>();
        set.add("Roma");
        set.add("Serge");
        set.add("Eugenie");
        set.add("Maksin");
        set.add("Pavel");
        set.add("Andrei");
        set.add("Sergey");
        set.add("Roma");


        System.out.println(set);

        Queue<String> queue = new ArrayDeque<>();


    }
}
