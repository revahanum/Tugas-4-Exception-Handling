import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in); //scanner digunakan untuk mengambil data yang diinput oleh pengguna

        try{
            //input data transaksi oleh pengguna
            System.out.print("Masukkan No Faktur: "); //input data nomor faktur
            String nofaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: "); //input data kode barang
            String kodebarang = scanner.nextLine();
            
            System.out.print("Masukkan Nama Barang: "); //input data nama barang
            String namabarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargabarang = Double.parseDouble(scanner.nextLine());
            if (hargabarang < 0) //validasi harga barang tidak boleh negatif
            {
                throw new IllegalArgumentException("Harga Barang Tidak Boleh Negatif.");
            }

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahbeli = Integer.parseInt(scanner.nextLine());
            if (jumlahbeli < 0) //validasi jumlah beli tidak boleh negatif
            {
                throw new IllegalAccessException("Jumlah Beli Tidak Boleh Negatif.");
            }

            //membuat objek transaksi dengan data yang telah diinputkan oleh pengguna
            transaksi Transaksi = new transaksi(kodebarang, namabarang, hargabarang, nofaktur, jumlahbeli);

            //menampilkan informasi transaksi kepada pengguna
            System.out.println("\n=== Informasi Transaksi ===");
            System.out.println(Transaksi.infotransaksi());
        }
        catch (NumberFormatException e) //menangkap error jika input berupa string yang seharusnya angka
        {
            System.out.println("Input Tidak Valid: Harus Berupa Angka.");
        }
        catch (IllegalArgumentException e) //menangkap error jika input tidak vali (angka negatif)
        {
            System.out.println("Input Tidak Valid: " + e.getMessage());
        }
        catch (Exception e) //menangkap semua error yang tidak spesifik
        {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
        finally   
        {
            scanner.close(); //menutup resource scanner agar tidak terjadi memory leak
        }
    }
}