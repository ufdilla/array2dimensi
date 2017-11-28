import java.util.*;

public class tiket {
    public static void main(String[] args) {
    
        int data[][] = 
        {
            {0, 800, 1100, 1300}, {800, 0, 500, 700}, {1000, 400, 0, 500}, {1200, 600, 400, 0}
        };
    
        String[] dataStr1 = {"Medan", "Jakarta", "Semarang", "Denpasar"};
        String[][] dataStr2 =
        {
            {"Medan"},{"Jakarta"}, {"Semarang"}, {"Denpasar"}
        };
      
        for (int i = 0; i < data.length; i++) { //nested repetition
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}