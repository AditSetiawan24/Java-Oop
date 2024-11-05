package enkapsulasi;
// enkapsulasi adalah membungkus atau menyembunikan sebagian data dan behavior suatu objek dari objek lain

// kelebihan enkapsulasi:
// 1. code mudah dimodifikasi tanpa mempengaruhi class lain
// 2. code muda dibaca dan dipahami
// 3. dalam jangka panjang, code lebih mudah di-maintain
// 4. dalam jangka panjang mempermudah dalam proses development

public class main {
    public static void main(String[] args) {
        pegawai pegawai1 = new pegawai("Rizky", 20);

        // Mengakses data melalui metode getter
        System.out.println("Nama: " + pegawai1.getNama());
        System.out.println("Umur: " + pegawai1.getUmur());

        // Mengubah data menggunakan metode setter
        pegawai1.setNama("Adit");
        pegawai1.setUmur(25);

        // Menampilkan data setelah perubahan
        System.out.println("Nama setelah diubah: " + pegawai1.getNama());
        System.out.println("Umur setelah diubah: " + pegawai1.getUmur());

    }
}
