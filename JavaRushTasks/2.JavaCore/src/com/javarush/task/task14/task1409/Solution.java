package com.javarush.task.task14.task1409;

/* 
Мосты
*/


import java.security.PublicKey;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}

