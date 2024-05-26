package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Иван Иванов",4.2);
        grades.put("Соня Темникова",3.2);
        grades.put("Василий Алибабаевич",4.4);
        grades.put("Безумный Старик",4.5);
        grades.put("Герман Сечин",4.8);
    }
}
