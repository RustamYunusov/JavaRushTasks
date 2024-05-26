package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (buffer.ready()) {
                lines.add(buffer.readLine());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Statics.FILE_NAME = "/tets.txt";

        System.out.println(lines);
    }

}
