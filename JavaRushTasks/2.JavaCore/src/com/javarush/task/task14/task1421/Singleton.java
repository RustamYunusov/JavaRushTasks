package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static  Singleton getInstance() {
        if(instance == null){		//если объект еще не создан
            instance = new Singleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объек

    }
}
