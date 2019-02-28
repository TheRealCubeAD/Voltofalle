package Voltogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainmenuScreen extends Screen{

    private JButton startGame;
    private JButton startSolver;

    public MainmenuScreen(View v){
        super(v);
        startGame = new JButton("Spiel starten!");
        startSolver = new JButton("Solver starten");

        startGame.addActionListener(this);
        startSolver.addActionListener(this);

        add(startGame, BorderLayout.CENTER);
        add(startSolver, BorderLayout.CENTER);
    }

    @Override
    protected void userAction(String action) {
        view.menuButtonClicked(action);
    }

    @Override
    protected void updateData(Msg msg) {
        return;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startGame)
        {
            System.out.println("MainmenuScreen: Start Game!");
            userAction("startGame");
        }
        else if (e.getSource() == startSolver)
        {
            System.out.println("MainmenuScreen: Start Solver!");
            userAction("startSolver");
        }
    }
}
