package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        InputStream inp=null;
        BufferedReader reader = null;
        try {
            inp = new FileInputStream(sc.nextLine());
            reader = new BufferedReader(new InputStreamReader(inp));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inp.close();
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}