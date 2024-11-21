public class barang {
    //properti untuk menyimpan data barang
    private String kodebarang;
    private String namabarang;
    private double hargabarang;

    //constructor ini untuk menginisialisasi data barang saat objek dibuat
    public barang(String kodebarang, String namabarang, double hargabarang)
    {
        this.kodebarang = kodebarang; //menyimpan nilai kode barang
        this.namabarang = namabarang; //menyimpan nilai nama barang
        this.hargabarang = hargabarang; //menyimpan nilai harga barang
    }

    //getter untuk mendapatkan kode barang
    public String getKodeBarang()
    {
        return kodebarang; //mengembalikan kode barang
    }

    //getter untuk mendapatkan nama barang
    public String getNamaBarang() 
    {
        return namabarang; //mengembalikan nama barang
    }

    //getter untuk mendapatkan harga barang
    public double getHargaBarang()
    {
        return hargabarang; //mengembalikan harga barang
    }

    //methode untuk menampilakan info barang
    public String infobarang()
    {
        return "Kode Barang: " + kodebarang + ", Nama Barang: " + namabarang + ", harga: " + hargabarang;
    }
}
