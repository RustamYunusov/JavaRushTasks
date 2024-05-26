package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        String lRU = ru.toLowerCase();
        if (lRU.equals("понедельник")) {
            en = "Monday";
        }
        else if (lRU.equals("вторник")) {
            en = "Tuesday";
        }
        else if (lRU.equals("среда")) {
            en = "Wednesday";
        }
        else if (lRU.equals("четверг")) {
            en = "Thursday";
        }
        else if (lRU.equals("пятница")) {
            en = "Friday";
        }
        else if (lRU.equals("суббота")) {
            en = "Saturday";
        }
        else if (lRU.equals("воскресенье")) {
            en = "Sunday";
        }

            else{
                en = "Недействительный день недели";
            }
        return en;

    }
}
