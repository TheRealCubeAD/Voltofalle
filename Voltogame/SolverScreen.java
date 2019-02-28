package Voltogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SolverScreen extends Screen {

    private JButton end;

    public SolverScreen(View v){
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
    protected void updateData(Msg msg) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == end)
        {
            System.out.println("SolverScreen: Main Menu!");
            userAction("mainMenu");
        }

    }
}
