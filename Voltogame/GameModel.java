import java.util.Random;

public class GameModel extends Model{

    Random rand = new Random();

    public GameModel(){
        super();
    }

    public void generateMatrix(){
        // Durchlaufe alle Zellen der Matrix
        for(int y = 0; i < this.cards.length; i++){
            for(int x = 0; j < this.cards[0].length; j++){
                // Generiere eine natuerliche Zahl zwischen 0 und 3
                this.cards[y][x] = new Card( rand.nextInt(4) );
            }
        }
    }

    public void generateIndicators(){
        int p_temp;
        // Summiere die Punkte der Zeile
        for(int y = 0; y < this.cards.length; y++){
            int pointsSum = 0;
            int voltoSum = 0;
            for(int x = 0; x < this.cards[0].length; x++){
                p_temp = this.cards[y][x].getPoints();
                pointsSum += p_temp;
                if(p_temp == 0){
                    voltoSum++;
                }
            }
            this.indicators[y][0] = pointsSum;
            this.indicators[y][1] = voltoSum;
        }
        // Summiere die Spalten
        for(int x = this.cards[0].length - 1; i >= 0; i--){
            int pointsSum = 0;
            int voltoSum = 0;
            for(int y = 0; y < this.cards.length; y++){
                p_temp = this.cards[y][x].getPoints();
                pointsSum += p_temp;
                if(p_temp == 0){
                    voltoSum++;
                }
            }
            this.indicators[this.cards[0].length - 1 - x + 5][0] = pointsSum;
            this.indicators[this.cards[0].length - 1 - x + 5][1] = voltoSum;
        }
    }

    private


}