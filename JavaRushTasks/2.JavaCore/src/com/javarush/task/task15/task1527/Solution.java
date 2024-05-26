package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int index = url.indexOf("?");
        String vl;
        String strVal="";
        ArrayList<String> objList = new ArrayList<>();
        if (index>0){
           String[] params = url.substring(index+1).split("\\&");
            for (int i = 0; i < params.length; i++) {
                int poz = params[i].indexOf("=");
                if (poz>0){
                    String variable = params[i].substring(0,poz);
                    strVal = strVal.concat(variable);
                    strVal = strVal.concat(" ");

                    vl = params[i].substring(poz+1);
                    if(variable.equals("obj") && vl.length()>0){
                        objList.add(vl);
                    }

                }
                else {
                    strVal = strVal.concat(params[i]);
                    strVal = strVal.concat(" ");
                }
            }
            System.out.println(strVal);
            for (int i = 0; i < objList.size(); i++) {
                try {
                    double sumdouble = Double.parseDouble(objList.get(i));
                    alert(sumdouble);
                }
                catch (NumberFormatException e){
                    alert(objList.get(i));
                }

            }



        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
