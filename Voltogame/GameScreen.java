package Voltogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameScreen extends Screen {

    private JButton end;
    public GameScreen(View v){
        super(v);

        end = new JButton("Ende");
        end.addActionListener(this);
        add(end, BorderLayout.CENTER);
    }

    @Override
    protected void userAction(String action) {
        view.menuButtonClicked(action);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == end)
        {
            System.out.println("GameScreen: Main Menu!");
            userAction("mainMenu");
        }

    }
}
