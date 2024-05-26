package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> lines=null;
        Scanner scPath = new Scanner(System.in);
        try
        {
            lines = Files.readAllLines(Path.of(scPath.nextLine()));
            for(String s: lines){
                System.out.println(s);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

