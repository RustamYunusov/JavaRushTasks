package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

import java.security.PublicKey;

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
    public interface CanRun{
        public void Run();
    }

    public interface CanSwim{
        public void Swim();
    }

    public abstract class Human implements CanRun, CanSwim{

    }
}
