package Voltogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class GameScreen extends Screen {

    private JButton end;
    private JLabel score;
    private Grid grid;

    public GameScreen(View v){
        super(v);

        end = new JButton("Ende");
        score = new JLabel("35");

        grid = new Grid(this);

        end.addActionListener(this);

        add(score, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
        add(end, BorderLayout.SOUTH);

    }

    @Override
    protected void userAction(String action) {
        view.menuButtonClicked(action);
    }

    @Override
    protected void updateData(Msg msg) {
        grid.updateData(msg);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == end)
        {
            System.out.println("GameScreen: Main Menu!");
            userAction("mainMenu");
        }
        else
        {
            view.gridButtonClicked(grid.getButton((JButton) e.getSource()));
        }

    }
}
