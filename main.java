// Cara buat class
class orang{
    String nama = "Nama palsu";
    int umur;
    int gaji;
// cara buat constructor
    orang (String nama, int  umur, int gaji){
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    // method tanpa return tanpa parameter
        void tampil(){
        System.out.println(this.nama);
        System.out.println(this.umur);
        System.out.println(this.gaji);
        }
    // method tanpa return dengan parameter
    // mutator
        void setNama(String value){
        this.nama = value;
        }
    // method dengan return tanpa parameter
    // Asessor
        int getgaji(){ 
            return this.gaji=gaji;
        }
        String getNama(){
            return this.nama=nama;
        }
    // method dg return dan dg parameter

}


// Class for enkapsulasi
class pegawai{
    public String nama;
    private int gaji;
    private int gajibaru;
    
    pegawai(){
        this.nama="rapli";
        this.gaji=100;
    }

    // getter atau asessor
    public int getgaji(){
        return this.gaji;
    }
    
    // setter atau mutator
    public void setgajibaru (int value){
        this.gajibaru=value;
    }
    
    void tampil(){
        System.out.println(nama);
        System.out.println(gaji);
        System.out.println(gajibaru);
    }
    }

// Cara class inheritance pewarisan
class orangTua{
    int duit = 1000000;
}
class anak extends orangTua{
    // kosong
}

public class main {
    public static void main(String[] args) {
        orangTua orangTuaA = new orangTua();
        anak anakA = new anak();
        System.out.println("Duit ortu : " + orangTuaA.duit);
        System.out.println("Duit anak : " + anakA.duit);

        // Bagian enkapsulasi
        // pegawai pegawai1 = new pegawai();
        // System.out.println(pegawai1.getgaji());
        // pegawai1.setgajibaru(10000000);
        // pegawai1.tampil();

        // Cara buat object
        // orang orang1 = new orang("Kipli", 12, 2000);
        //cara panggil method  tanpa return tanpa parameter
        // orang1.tampil();
        //cara panggil method tanpa return dengan parameter
        // orang1.setNama("Uzumaki");
        // orang1.tampil();
        // cara panggi method dg return tanpa parameter
        // System.out.println(orang1.getgaji());
        // System.out.println(orang1.getNama());

// mengisi data dari sebuah class secara normal dan tidak efektif
        // orang1.nama = "Rahmad";
        // orang1.umur = 25;
        // orang1.gaji=1000;

// cara menampilkan hasil dari objek
        // System.out.println(orang1.nama);
        // System.out.println(orang1.umur);
        // System.out.println(orang1.gaji);
    }
}