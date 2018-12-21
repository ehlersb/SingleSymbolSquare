import java.util.Random;

/**
 * Created by Benjamin Ehlers on 12/21/2018.
 */
public class SingleSymbolSquare {
    private int n;
    private int[][] square;

    public SingleSymbolSquare(int n) {
        this.n = n;
        square = new int[n][n];
    }

    public void generateSquare() {
        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                square[i][j] = rand.nextInt(2);
            }
        }
    }

    public boolean isValid() {
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(checkSquares(j,i) == false) return false;
            }
        }
        return true;
    }

    public boolean checkSquares(int j, int i) {
        for(int k = 1; k < n - Math.max(j, i);k++) {
            if(square[j][i] == square[j+k][i]
                    && square[j+k][i] == square[j][i+k]
                    && square[j][i+k] == square[j+k][i+k])
                return false;
        }
        return true;
    }

    public int getN() {
        return n;
    }

    public int[][] getSquare() {
        return square;
    }

}
