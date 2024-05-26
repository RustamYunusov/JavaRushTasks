package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate= new Date(83,12,15);

    public static void main(String[] args) {

        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE",new Locale("ru"));
        return formatter.format(date);
    }
}
