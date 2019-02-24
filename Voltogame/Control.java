package Voltogame;

import java.util.Observable;

public class Control extends Observable {

    private Model model;

    public Control(){
        addObserver(new View(this));
    }


    public void menuButtonClicked(String a) {
        switch (a)
        {
            case "startGame":
                System.out.println("Game Model called");
                setChanged();
                notifyObservers(a);
                break;
            case "startSolver":
                System.out.println("Solver Model called");
                setChanged();
                notifyObservers(a);
                break;
            case "mainMenu":
                System.out.println("Models deleted, Main Menu");
                model = null;
                setChanged();
                notifyObservers(a);
                break;

        }
    }

    @Override
    public String toString(){
        return "Control";
    }
}
