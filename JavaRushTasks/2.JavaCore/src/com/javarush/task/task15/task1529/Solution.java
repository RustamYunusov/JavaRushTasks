package com.javarush.task.task15.task1529;

import javax.security.auth.login.AccountLockedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner scanner = new Scanner(System.in);
        String par = scanner.nextLine();
        if(par.equals("helicopter")){
            result = new Helicopter();
        } else if (par.equals("plane")) {
            int users = scanner.nextInt();
            result = new Plane(users);
        }
        scanner.close();
    }
}
