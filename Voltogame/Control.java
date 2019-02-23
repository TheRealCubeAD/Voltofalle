package Voltogame;

import java.util.Observable;

public class Control extends Observable {

    private Model model;

    public Control(){
        model = new Model();
        addObserver(new View(this));
    }


}
