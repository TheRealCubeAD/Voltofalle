package Voltogame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Screen extends JPanel implements ActionListener {

    protected View view;

    public Screen(View v){
        view = v;
    }

    protected abstract void userAction(String action);
    protected abstract void updateData(Msg msg);
}
