package Voltogame;

import java.util.Observable;

public class Model extends Observable {

    public Model(){

    }

    public void start(){
        setChanged();
        notifyObservers(new Msg(new int[][] {   {-1, -1, -1, -1, -1},
                                                {-1, -1, -1, -1, -1},
                                                {-1, -1, -1, -1, -1},
                                                {-1, -1, -1, -1, -1},
                                                {-1, -1, -1, -1, -1}},

                                new int[][] {   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}}

                                                ));
    }

    @Override
    public String toString(){
        return "Model";
    }

}
