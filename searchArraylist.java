package com.Assignment3;

import java.util.ArrayList;

public class searchArraylist {
    public static int searchFirst(ArrayList<String> list, String element){
        return list.indexOf(element);
    }

    public static int searchLast(ArrayList<String> list, String element){
        return list.lastIndexOf(element);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Joy");
        list.add("Hit");
        list.add("Assignment");
        list.add("Java");
        list.add("joy");
        list.add("java");
        list.add("joy");
        String element1 = "joy";
        String element2 = "new";

        System.out.println("the list is : " + list);
        System.out.println("Searching for " + element1 + " in the list : " + searchFirst(list, element1));
        System.out.println("Searching for last index of " + element1 + " in list : " + searchLast(list,element1));
        System.out.println("Searching for " + element2 + " in the list : " + searchFirst(list,element2));
    }
}
