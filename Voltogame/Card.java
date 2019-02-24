public class Card{

    private int points;
    private boolean revealed;

    public Card( int points ){
        this.points = points;
        this.revealed = false;
    }

    public int getPoints(){
        return this.points;
    }

    public boolean getRevealed(){
        return this.revealed;
    }

}