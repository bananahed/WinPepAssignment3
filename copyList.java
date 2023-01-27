package com.Assignment3;
import java.util.*;
public class copyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("Before : " + list);
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list.addAll(3, list2);
        System.out.println("After : " + list);
    }
}
