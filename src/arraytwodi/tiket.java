
package arraytwodi;
//import java.util.Scanner;

public class tiket 
{
    public static void main(String[] args) {
        String harga[][]= {{" ", "Medan", "Jakarta", "Semarang", "Denpasar"}, 
                        {"Medan", " ", "800", "1100", "1300"}, 
                        {"Jakarta", "800", " ", "500", "700"},
                        {"Semarang", "1000", "400", " ", "500"},
                        {"Denpasar", "1200", "600", "400", " "}};
        for (String[] harga1 : harga){
            System.out.println(harga1[0] +" "+ harga1[1] +" "+ harga1[2]+" "+ harga1[3]+" "+harga[4]);            
        }
        System.out.println("");
    }
    
//    public static void main(String[] args) 
//    {
//        int row, kolom;
//        int tambah;
//        String[][] data = new String[6][4];
//        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan Data Perjalanan : \n");
//        
//        for(row = 0; row < 10; row++)
//        {
//            System.out.println("Tambah  Data Tekan 1 \t Lihat Data Tekan 2 \n");
//            try 
//            {
//                tambah = input.nextInt();
//            }
//            catch (Exception err)
//            {
//                System.out.println("Error");
//                break;
//            }
//            
//            if (tambah == 1)
//            {
//                System.out.println("Masukkan Data Perjalanan : \n");
//                System.out.println("Lokasi Keberangkatan : ");
//                data[row][0] = input.next();
//                System.out.println("Lokasi Tujuan : ");
//                data[row][1] = input.next();
//                System.out.println("Harga Tiket :");
//                data[row][2] = input.next();
//            }
//            else if (tambah == 2)
//            {
//                System.out.println("Asal -> Tujuan : Harga ");
//                for (row = 0; row < 10; row++)
//                {
//                    for (kolom = 0; kolom < 3; kolom ++)
//                    {
//                        System.out.println(data[row][kolom] );
//                    }
//                }
//            }
//        }
//    }
    
}
