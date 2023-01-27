
package com.Assignment3;
import java.util.*;
public class swapArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Before swapping, ArrayList contains : " + list);
        Collections.swap(list, 0, 4);
        System.out.println("After swapping, ArrayList contains : " + list);
    }
}
