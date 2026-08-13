package com.ty.strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            } else {
                if (st.isEmpty() || st.pop() != ch) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(new ValidParentheses().isValid(s));
    }

}
