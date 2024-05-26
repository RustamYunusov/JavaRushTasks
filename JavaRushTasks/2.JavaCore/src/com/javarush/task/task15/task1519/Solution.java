package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        while (!inp.equals("exit")){
            try{
                if(inp.contains(".")){
                    print(Double.parseDouble(inp));
                } else if (Integer.parseInt(inp)>0 && Integer.parseInt(inp)<128) {
                    print((short) Integer.parseInt(inp));
                }else if (Integer.parseInt(inp)<=0 || Integer.parseInt(inp)>=128) {
                    print(Integer.parseInt(inp));
                }
            }
            catch (NumberFormatException e){
                print((String) inp);
            }
            inp = scanner.next();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
