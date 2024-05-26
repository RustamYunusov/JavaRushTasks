package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        Scanner scanner =new Scanner(System.in);

        List users = new ArrayList<String>(4);
        users.add("user");
        users.add("loser");
        users.add("coder");
        users.add("proger");
        String strIn = scanner.nextLine();
        while (users.indexOf(strIn)>=0)
        {
            //создаем объект, пункт 2
           if(strIn.equals("user")){
               person = new Person.User();
           } else if (strIn.equals("loser")) {
               person = new Person.Loser();
           } else if (strIn.equals("coder")) {
               person = new Person.Coder();
           } else if (strIn.equals("proger")) {
               person = new Person.Proger();
           }
            doWork(person); //вызываем doWork
            strIn = scanner.nextLine();
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }else if (person instanceof Person.Proger) {
                ((Person.Proger) person).enjoy();
        }
    }
}
