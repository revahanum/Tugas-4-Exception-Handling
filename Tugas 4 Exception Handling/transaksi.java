public class transaksi extends barang { //class transaksi merupakan turunan dari class barang
    private String nofaktur;
    private int jumlahbeli;

    //constructor ini memanggil constructor dar kelas induk (barang) menggunakan super
    public transaksi (String kodebarang, String namabarang, double hargabarang, String nofaktur, int jumlahbeli)
    {
        super (kodebarang, namabarang, hargabarang);
        this.nofaktur = nofaktur;
        this.jumlahbeli = jumlahbeli;
    }

    //method untuk menghitung total transaksi
    //method ini juga akan menampilkan exception jika harga barang atau jumlah beli negatif
    public double hitungtotal() throws Exception
    {
        //mengecek jika jumlah beli atau harga barang negatif
        if (jumlahbeli < 0 || getHargaBarang() < 0)
        {
            throw new Exception("Jumlah Beli atau Harga Barang tidak boleh negatif."); //lemparkan exception jika negatif
        }
        return getHargaBarang() * jumlahbeli; //menghitung total harga = harga barang * jumlah beli
    }

    // Method untuk menampilkan informasi lengkap transaksi
    // Jika terjadi exception dalam perhitungan total, maka exception akan ditangkap di dalam catch
    public String infotransaksi()
    {
        try {
            double total = hitungtotal(); // Memanggil method hitungtotal() untuk mendapatkan total harga
            // Mengembalikan informasi transaksi yang lengkap
            return "No Faktur: " + nofaktur + "\n"  
                    + super.infobarang() + "\n"  // Menggunakan method 'infobarang()' dari class induk ('barang')
                    + "Jumlah Beli: " + jumlahbeli + "\n"
                    + "Total: " + total;
        }
        catch (Exception e)
        {
            // Menangkap exception jika terjadi kesalahan dan mengembalikan pesan kesalahan
            return "Kesalahan: " + e.getMessage();
        }
    }
}
