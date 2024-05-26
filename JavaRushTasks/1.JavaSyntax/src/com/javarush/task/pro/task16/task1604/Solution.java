package com.javarush.task.pro.task16.task1604;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate=new GregorianCalendar(1983,Calendar.FEBRUARY,15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        Date date=calendar.getTime();
        DateFormat formatter = new SimpleDateFormat("EEEE", new Locale("ru", "RU"));

        return formatter.format(date);
        //return calendar.get(Calendar.DAY_OF_WEEK);

    }
}
