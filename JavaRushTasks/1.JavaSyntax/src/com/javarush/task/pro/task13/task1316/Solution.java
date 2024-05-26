package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] curses = JavarushQuest.values();
        for (JavarushQuest curs: curses)
            System.out.println(curs.ordinal());
    }
}
