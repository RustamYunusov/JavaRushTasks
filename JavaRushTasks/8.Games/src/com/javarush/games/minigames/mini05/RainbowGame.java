package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize(){
        setScreenSize(10, 7);
        showGrid(false);
        Color color = Color.RED;
        for (int j = 0; j <10 ; j++) {

            for (int i = 0; i < 7; i++) {
                if(i==0 ) {
                    color = Color.RED;
                } else if (i==1 ) {
                    color = Color.ORANGE;
                } else if (i==2) {
                    color = Color.YELLOW;
                } else if (i == 3) {
                    color = Color.GREEN;
                } else if (i == 4) {
                    color = Color.BLUE;
                }else if (i == 5) {
                    color = Color.INDIGO;
                }else if (i == 6) {
                    color = Color.VIOLET;
                }
                setCellColor(j, i, color);
            }

        }
    }
}

