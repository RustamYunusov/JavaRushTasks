package com.javarush.task.task16.task1601;


/*
My first thread
*/



public class Solution {
    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.printf("My first thread");
        }
    }

    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}
