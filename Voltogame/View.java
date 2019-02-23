package Voltogame;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    private Control control;
    public View(Control c) {
        control = c;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}

