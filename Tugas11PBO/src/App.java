import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {

        Transaksi penjualan = new Transaksi(); // polymorphisme

        try {
            penjualan.isidata();
        } catch (InputMismatchException e) { // exception handling
            System.out.println("data yang dimasukkan tidak valid");
        }

        penjualan.Transaksi();

    }
}
   

