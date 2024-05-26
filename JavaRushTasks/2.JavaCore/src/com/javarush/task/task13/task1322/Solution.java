package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    public static class StringObject implements SimpleObject<String> {
        private StringObject instance;
        @Override
        public SimpleObject<String> getInstance() {
            if (instance == null) {
                instance = new StringObject();
            }
            return instance;
        }

    }
}
