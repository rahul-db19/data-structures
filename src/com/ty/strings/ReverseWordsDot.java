package com.ty.strings;

import java.util.Stack;

public class ReverseWordsDot {
    private static String reverseDotWords(String str){
        Stack<String> st = new Stack<>();
        String temp = "";
        String S = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                st.push(temp);
                st.push(".");
                temp = "";
            } else {
                temp = temp + str.charAt(i);
            }
        }
        st.push(temp);
        for (int i = st.size() - 1; i >= 0; i--) {
            S += st.get(i);
        }
        return S;
    }
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(reverseDotWords(str));
    }
}
