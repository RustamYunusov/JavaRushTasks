package com.javarush.task.pro.task13.task1319;
import java.util.*;
/* 
Месяцы в сезоне
*/

import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths() {
        List<Month> list = new ArrayList<Month>();
        list.add(Month.DECEMBER);
        list.add(Month.JANUARY);
        list.add(Month.FEBRUARY);
        Month[] arr = new Month[list.size()];
        arr = list.toArray(arr);
        return arr;
    }

    public static Month[] getSpringMonths() {
        List<Month> list = new ArrayList<Month>();

        list.add(Month.MARCH);
        list.add(Month.APRIL);
        list.add(Month.MAY);
        Month[] arr = new Month[list.size()];
        arr = list.toArray(arr);
        return arr;
    }

    public static Month[] getSummerMonths() {
        List<Month> list = new ArrayList<Month>();

        list.add(Month.JUNE);
        list.add(Month.JULY);
        list.add(Month.AUGUST);
        Month[] arr = new Month[list.size()];
        arr = list.toArray(arr);
        return arr;
    }

    public static Month[] getAutumnMonths() {
        List<Month> list = new ArrayList<Month>();
        list.add(Month.SEPTEMBER);
        list.add(Month.OCTOBER);
        list.add(Month.NOVEMBER);

        Month[] arr = new Month[list.size()];
        arr = list.toArray(arr);
        return arr;
    }

}