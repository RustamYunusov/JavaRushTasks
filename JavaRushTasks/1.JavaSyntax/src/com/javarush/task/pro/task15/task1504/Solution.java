package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scPath = new Scanner(System.in);
        try (
                InputStream f1 = Files.newInputStream(Path.of(scPath.nextLine()));
                OutputStream f2 = Files.newOutputStream(Path.of(scPath.nextLine())))
        {

            byte[] buff = new byte[2];
            int off = 0;
            while (f1.available()>0){
                int real = f1.read(buff);
                if (real==2){
                    f2.write(buff[1]);
                    f2.write(buff[0]);

                } else if (real==1) {
                    f2.write(buff[0]);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

