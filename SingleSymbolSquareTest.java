/**
 * Created by Benjamin Ehlers on 12/21/2018.
 */
public class SingleSymbolSquareTest {
    public static void main(String[] args) {
        SingleSymbolSquare singleSymbolSquare = new SingleSymbolSquare(7);
        singleSymbolSquare.generateSquare();
        while(!singleSymbolSquare.isValid()) {
            singleSymbolSquare.generateSquare();
        }
        int n = singleSymbolSquare.getN();
        for(int i = 0; i < n; i++) {
            String lineToPrint = "";
            for(int j = 0; j < n; j++) {
                if(j == n) {
                    lineToPrint += singleSymbolSquare.getSquare()[i][j] + "";
                }
                else {
                    lineToPrint += singleSymbolSquare.getSquare()[i][j] + " ";
                }
            }
            System.out.println(lineToPrint);
        }
    }
}
