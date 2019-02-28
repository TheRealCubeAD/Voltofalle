package Voltogame;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class View extends JFrame implements Observer {


    private Control control;
    private JPanel panel;


    public View(Control c) {
        super("Voltofalle");
        control = c;
        setSize(640, 360);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel(new CardLayout());
        panel.add("mainMenu", new MainmenuScreen(this));
        panel.add("GameScreen", new GameScreen(this));
        panel.add("SolverScreen", new SolverScreen(this));

        add(panel);
        setVisible(true);

    }


    public void menuButtonClicked(String a){
        control.menuButtonClicked(a);
    }

    public void gridButtonClicked(int[] i){
        control.gridButtonClicked(i);
    }

    @Override
    public void update(Observable o, Object arg) {
        switch (o.toString()){
            case "Control":
                CardLayout cardLayout;
                String argument = (String) arg;
                switch (argument){
                    case "startGame":
                        System.out.println("View: Start Game!");
                        cardLayout = (CardLayout)panel.getLayout();
                        cardLayout.show(panel, "GameScreen");
                        break;
                    case "startSolver":
                        System.out.println("View: Start Solver!");
                        cardLayout = (CardLayout)panel.getLayout();
                        cardLayout.show(panel, "SolverScreen");
                        break;
                    case "mainMenu":
                        System.out.println("View: Main Menu!");
                        cardLayout = (CardLayout)panel.getLayout();
                        cardLayout.show(panel, "mainMenu");
                        break;
                    default:
                        System.out.println("WTF?");
                }
                break;
            case "Model":
                System.out.println("Update from Model!");
                for (Component component : panel.getComponents()){
                    if (component.isVisible()){
                        Screen s = (Screen) component;
                        System.out.println(s.toString());
                        s.updateData((Msg) arg);
                    }
                }
                break;
            default:
                System.out.println("wtf?");

        }
    }
}

