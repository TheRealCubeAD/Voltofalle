package Voltogame;

import java.util.Observable;

public class Model extends Observable {

    /*
    c  , c , c , c , c | i0
    c  , c , c , c , c | i1
    c  , c , c , c , c | i2
    c  , c , c , c , c | i3
    c  , c , c , c , c | i4
    i9 , i8, i7, i6, i5
     */
    private Card[][] cards;
    // indicators[i] = ( pointsSum, voltoSum )
    private int[][] indicators;

    public Model(){
        this.cards[][] = new cards[5][5];
    }

    public abstract userAction( Action a ){}

    public abstract void generateMatrix(){}
    public abstract void generateIndicators(){}
    public abstract void update(){}
    private abstract Msg generateMsg(){}

}
