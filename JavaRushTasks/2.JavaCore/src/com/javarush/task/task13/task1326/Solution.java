package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String FileOutName = sc.nextLine();
        try {
            BufferedInputStream bufferedReader = new BufferedInputStream(new FileInputStream(FileOutName));
            DataInputStream dis = new DataInputStream(bufferedReader);
            int j;
            List<Integer> nums = new ArrayList<Integer>();

            while (dis.available() != 0) {
                nums.add(Integer.valueOf(dis.readLine()));
            }
            Collections.sort(nums);

            for (int i: nums) {
                if(i%2==0)
                    System.out.println(i);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
