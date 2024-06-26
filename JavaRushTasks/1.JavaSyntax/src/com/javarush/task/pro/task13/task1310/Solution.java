package com.javarush.task.pro.task13.task1310;

import java.util.HashMap;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишите тут ваш код
        for (String key: grades.keySet())
        {
            String[] valKey = key.split(" ");
           /* if (valKey.length>1) {
                System.out.println(valKey[1]);
            }*/
            System.out.println(key);

        }
    }

    public static Double getAverageMark() {
        //напишите тут ваш код
        Double averVal = new Double(0) ;
        for (String key: grades.keySet())
        {
            averVal = averVal + grades.get(key);
        }
        return averVal/grades.size();
    }
}
