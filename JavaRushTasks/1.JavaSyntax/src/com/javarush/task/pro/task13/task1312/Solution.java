package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        var programmingLanguages = new HashMap<Integer, String>();
        int cnt = 0;
        programmingLanguages.put(cnt++,"Java");
        programmingLanguages.put(cnt++,"Kotlin");
        programmingLanguages.put(cnt++,"Go");
        programmingLanguages.put(cnt++,"Javascript");
        programmingLanguages.put(cnt++,"Typescript");
        programmingLanguages.put(cnt++,"Python");
        programmingLanguages.put(cnt++,"PHP");
        programmingLanguages.put(cnt++,"C++");
        return programmingLanguages;
    }

}
