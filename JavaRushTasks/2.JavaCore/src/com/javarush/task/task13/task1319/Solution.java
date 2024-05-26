package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String out_file_name = sc.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(out_file_name));
        try {
            String line = sc.nextLine();
            while (!line.equals("exit")){
                writer.write(line);
                writer.newLine();
                line = sc.nextLine();
            }
            if (line.equals("exit")) {
                writer.write(line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
