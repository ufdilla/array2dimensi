/**
 * tiket3
 */
public class tiket3 {

    public static void main(String[] args) {
        int data[][] = { { 0, 800, 1100, 1300 }, { 800, 0, 500, 700 }, { 1000, 400, 0, 0 }, { 1200, 600, 400, 0 } };

        try {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    System.out.println(data[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception err) {
            System.out.println("Error.");
        }
    }
}