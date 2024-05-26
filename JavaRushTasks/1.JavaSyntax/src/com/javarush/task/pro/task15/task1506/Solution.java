package com.javarush.task.pro.task15.task1506;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        List<String> lines=null;
        Scanner scPath = new Scanner(System.in);
        try
        {
            lines = Files.readAllLines(Path.of(scPath.nextLine()));
            for(String str: lines){

                //System.out.print(s.replace(";","").replace(" ",""));
                for(int i = 0; i < str.length(); i++){
                    if (str.charAt(i) != '.' &&  str.charAt(i) != ',' && str.charAt(i) != ' '){
                        System.out.print(str.charAt(i));
                    }

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

