package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import java.io.IOError;

public class Solution {
    public static int A = 0;
    public static int B = 5;
    static {
        //throw an exception here - выбросьте эксепшн тут
        B = B / A;
    }



    public static void main(String[] args) {
        System.out.println(B);
    }
}
