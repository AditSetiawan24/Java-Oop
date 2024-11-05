package enkapsulasi;

public class pegawai {
    private String nama;
    private int umur;

    // Constructor untuk mengatur nilai awal
    public pegawai(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode getter untuk mengambil nilai `nama`
    public String getNama() {
        return nama;
    }

    // Metode setter untuk mengatur nilai `nama`
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode getter untuk mengambil nilai `umur`
    public int getUmur() {
        return umur;
    }

    // Metode setter untuk mengatur nilai `umur`
    public void setUmur(int umur) {
        // Validasi umur harus lebih dari 0
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid.");
        }
    }
}
