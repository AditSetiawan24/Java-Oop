package pewarisan;
// pewarisan adalah konsep dalam pbo dimana sebuah parent class atau super class dapat mewariskan atribut dan method ke child class atau subclass

// access modifier:
// 1. public : dapat diakses dari mana saja
// 2. private : hanya dapat diakses dari dalam class itu sendiri
// 3. protected : hanya dapat diakses dari dalam class itu sendiri dan class turunannya

// sifat pewarisan:
// 1. class turunan akan mewarisi atribut dan method yang dimiliki oleh class induk
// 2. class turunan dapat memiliki atribut dan method tambahan yang tidak dimiliki oleh class induk
// 3. jika class induk dirubah maka semua class turunan akan ikut berubah
// 4. perubahan pada class turunan tidak akan berpengaruh pada class induk

// kelebihan pewarisan:
// 1. code reusability
// 2. code lebih mudah dibaca
// 3. code lebih mudah di-maintain

// jenis pewarisan:
// 1. Single Inheritance
// satu class induk diturunkan ke satu class turunan
// 2. Multiple Inheritance
// satu class induk diturunkan ke dua class turunan atau lebih
// 3. Multilevel Inheritance
// class turunan menjadi induk bagi class turunan lainnya
// 4. Hierarchical Inheritance
// satu class induk diturunkan ke dua class turunan atau lebih
// 5. Hybrid Inheritance
// gabungan dari beberapa jenis pewarisan


public class main2 {
    public static void main(String[] args) {
        orangTua orangTuaA = new orangTua();
        anak anakA = new anak();
        System.out.println("harta ortu : " + orangTuaA.harta);
        System.out.println("harta anak : " + anakA.harta);
    }
}
