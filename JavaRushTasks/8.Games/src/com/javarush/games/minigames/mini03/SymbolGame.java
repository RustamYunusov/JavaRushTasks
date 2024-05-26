package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

import java.util.Collection;

/* 
Простая программа
*/

public class SymbolGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize()
    {
        setScreenSize(8, 3);
        String str = "JAVARUSH";
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            setCellValueEx(i, 1, Color.ORANGE, str.substring(i,i+1));

        }

    }
}
