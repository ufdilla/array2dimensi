
package arraytwodi;

public class tiket 
{
    public static void main(String[] args) 
    {
        String[][] data = 
        {
            {"Medan", "Jakarta", "800,000"},
            {"Medan", "Semarang", "1,100,000"},
            {"Medan", "Denpasar", "1,300,000"},
            {"Jakarta", "Semarang", "500,000"},
            {"Jakarta", "Denpasar", "700,000"},
            {"Semarang", "Denpasar", "500,000"},
            
            {"Jakarta", "Semarang", "400,000"},
            {"Jakarta", "Denpasar", "600,000"},
            {"Medan", "Jakarta", "800,000"},
            {"Medan", "Semarang", "1,000,000"},
            {"Medan", "Denpasar", "1,200,000"},
            {"Semarang", "Denpasar", "400,000"}
        };
        
        for (int a = 0; a <= data.length; a++)
        {
            try 
            {
            if(a < (data.length/2))
            {
            System.out.println("Lokasi Berangkat : " + data[a][0]);
            System.out.println("Lokasi Tujuan : " + data[a][1]);
            System.out.println("Harga Tiket : " + data[a][2]);
            System.out.println("==============================================");
            }
            
            else if(a >= (data.length/2))
            {
            System.out.println("Lokasi Berangkat : " + data[a][1]);
            System.out.println("Lokasi Tujuan : " + data[a][0]);
            System.out.println("Harga Tiket : " + data[a][2]);
            System.out.println("==============================================");
            }
            }
            catch (Exception err)
            {
                System.out.println( "Error.");
            }
        }
    }
}
