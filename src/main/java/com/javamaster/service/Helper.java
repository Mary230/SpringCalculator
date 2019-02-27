package com.javamaster.service;

public class Helper {

    public static String getExample(int a, int b, char sign){
        char c = ' ';
        String str = "";
        switch (sign){
            case '+': c= '+';break;
            case '-': c= '-';break;
            case '*': c= '*';break;
            case '/': c= '÷';break;
        }
        if (a < 0) {
            str += "(" + a + ")";
        }
        else str += a;
        str += c;
        if (b < 0) {
            str += "(" + b + ")";
        }
        else str += b;
        str+='=';
        return str;
    }
}
