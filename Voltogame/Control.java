package Voltogame;

import java.util.Arrays;
import java.util.Observable;

public class Control extends Observable {

    private View view;
    private Model model;

    public Control(){
        view = new View(this);
        addObserver(view);
    }


    public void menuButtonClicked(String a) {
        switch (a)
        {
            case "startGame":
                System.out.println("Game Model called");

                model = new Model();
                model.addObserver(view);
                setChanged();
                notifyObservers(a);
                model.start();

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

    public void gridButtonClicked(int[] i){
        System.out.println("Control: " + Arrays.toString(i));
    }

    @Override
    public String toString(){
        return "Control";
    }
}
