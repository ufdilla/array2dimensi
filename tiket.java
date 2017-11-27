/**
 * tiket
 */
public class tiket {
    public static void main(String[] args) {
    
        int data[][] = 
        {
            {0, 800, 1100, 1300}, {800, 0, 500, 700}, {1000, 400, 0, 500}, {1200, 600, 400, 0}
        };
      
        try 
            {
                System.out.println("Medan To Medan : " + data[0][0]);
                System.out.println("Medan To Jakarta : " + data[0][1] );
                System.out.println("Medan To Semarang : " + data[0][2]);
                System.out.println("Medan To Denpasar : " + data[0][3]);
                System.err.println("Jakarta To Medan : " + data[1][0]);
                System.out.println("Jakarta To Jakarta : " + data[1][1]);
                System.out.println("Jakarta To Semarang : " + data[1][2]);
                System.out.println("Jakarta To Denpasar : " + data[1][3]);
                System.out.println("Semarang To Medan : " + data[2][0]);
                System.out.println("Semarang To Jakarta : " + data[2][1]);
                System.out.println("Semarang To Semarang : " + data[2][2]);
                System.out.println("Semarang To Denpasar : " + data[2][3]);
                System.out.println("Denpasar To Medan : " + data[3][0]);
                System.out.println("Denpasar To Jakarta : " + data[3][1]);
                System.out.println("Denpasar To Semarang : " + data[3][2]);
                System.out.println("Denpasar To Denpasar : " + data[3][3]);
            }
            catch (Exception err)
            {
                System.out.println( "Error.");
            }
    }
}