package polimorfisme;
// Polimorfisme adalah proses merepresentasikan suatu bentuk ke beberapa bentuk

// kelebihan polimorfisme:
// 1. code reusability
// 2. lebih mudah dikembangkan
// 3. method bisa banyak tipe data

// kekurangan polimorfisme:
// 1. sulit untuk dibaca
// 2. pelru waktu
// 3. perlu ahli untuk implementasinya

// overloading : pembuatan lebih dari satu method dengan nama yang sama
// Method Overloading dimungkinkan dengan syarat tertentu :
// 1. Memiliki nama yang sama
// 2. Jumlah parameter tidak sama
// 3. Jenis parameter tidak sama
// 4. Urutan parameter tidak sama

// overriding : Overriding merupakan implementasi berbeda untuk suatu method pada kelas yang diwariskan
// Method Overriding dimungkinkan dengan syarat tertentu :
// 1. Memiliki nama yang sama
// 2. Memiliki parameter yang sama
// 3. Urutan parameter tidak sama

public class main3 {
    public static void main(String[] args) {
        hewan hewanA = new hewan();
        kucing kucingA = new kucing();
        anjing anjingA = new anjing();

        hewanA.suara();
        kucingA.suara();
        anjingA.suara();
    }
}
