package com.javamaster.service;

public class Calculator {
    public static int go(int a, int b, char sign){
        switch (sign){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': {
                try {
                    return a/b;
                }catch (Exception e){
                    return 0;
                }
            }
        }
        return 0;
    }
}
