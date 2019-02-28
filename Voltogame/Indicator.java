package Voltogame;

import javax.swing.*;
import java.awt.*;

public class Indicator extends JPanel{

    private Grid grid;
    private JLabel volt;
    private JLabel multiplikator;

    public Indicator(Grid g){
        grid = g;
        volt = new JLabel("x");
        multiplikator = new JLabel("x");

        add(volt, BorderLayout.PAGE_START);
        add(multiplikator, BorderLayout.PAGE_END);
    }

    public void updateData(int v, int m){
        volt.setText(Integer.toString(v));
        multiplikator.setText(Integer.toString(m));
    }
}
