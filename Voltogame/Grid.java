package Voltogame;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {

    private Screen screen;
    private GridLayout layout;
    private JButton [][] buttonGrid;
    private Indicator [] indicators;

    public Grid(Screen s){
        super();

        screen = s;

        layout = new GridLayout(6, 6, 10, 10);
        setLayout(layout);


        buttonGrid = new JButton[5][5];
        indicators = new Indicator[10];

        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 4; j++){
                buttonGrid[i][j] = new JButton("x");
                buttonGrid[i][j].addActionListener(screen);
            }
        }

        for (int i = 0; i <= 9; i++){
                indicators[i] = new Indicator(this);
        }

        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 4; j++){
                add(buttonGrid[i][j]);
            }
            add(indicators[i]);
        }

        for (int i = 5; i <= 9; i++){
                add(indicators[i]);
        }
    }

    public int[] getButton(JButton b){
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 4; j++){
                if (buttonGrid[i][j] == b){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public void updateData(Msg msg){
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 4; j++){
                buttonGrid[i][j].setText(Integer.toString(msg.getButtonGridUpdate()[i][j]));
            }
        }

        for (int i = 0; i <= 9 ; i++){
                indicators[i].updateData(msg.getIndicatorUpdate()[0][i], msg.getIndicatorUpdate()[1][i]);
        }
    }
}
