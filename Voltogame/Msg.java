package Voltogame;

public class Msg {
    private int[][] buttonGridUpdate;
    private int[][] indicatorUpdate;

    public int[][] getIndicatorUpdate() {
        return indicatorUpdate;
    }

    public int[][] getButtonGridUpdate() {
        return buttonGridUpdate;
    }

    public Msg(int[][] b, int[][] i){
        buttonGridUpdate = b;
        indicatorUpdate = i;
    }
}
