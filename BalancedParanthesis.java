package com.Assignment3;
import java.util.*;
public class BalancedParanthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);

            if(ch=='(') {
                st.push(ch);
            }

            if(ch==')') {

                if(st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = st.pop();

                if(ch==')' && top!='(') {
                    System.out.println("Not Balanced");
                    return;
                }

            }
        }

        if(st.isEmpty()) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
