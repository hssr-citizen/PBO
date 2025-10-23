public class mainmhs {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM DEMONSTRASI CLASS DAN OBJECT ===\n");
        
        // 2. Buat object dengan constructor yang berbeda
        System.out.println("1. MEMBUAT OBJECT DENGAN CONSTRUCTOR BERBEDA");
        
        // Object dengan constructor default
        mhs mhs1 = new mhs();
        
        // Object dengan constructor parameter
        mhs mhs2 = new mhs("Ijat", 21, "Teknik");
        
        System.out.println(); // spasi
        
        // 3. Buktikan bahwa kedua object sudah terbentuk
        System.out.println("2. MEMBUKTIKAN OBJECT SUDAH TERBENTUK");
        System.out.println("--- Memanggil method dari object mhs1 ---");
        mhs1.tampilkanInfo();
        
        System.out.println("\n--- Memanggil method dari object mhs2 ---");
        mhs2.tampilkanInfo();
        
        System.out.println(); // spasi
        
        // 5. Akses semua properties class dari main class
        System.out.println("3. MENGAKSES PROPERTIES DENGAN VISIBILITY BERBEDA");
        
        // Akses property public - BISA diakses langsung
        System.out.println("Akses property public (nama):");
        System.out.println("mhs1.nama = " + mhs1.nama);
        mhs1.nama = "Riast Dwi Sanditya";
        System.out.println("Setelah diubah: mhs1.nama = " + mhs1.nama);
        
        System.out.println(); // spasi
        
        // Akses property protected - TIDAK BISA diakses langsung dari luar package/class
        System.out.println("Akses property protected (usia):");
        // mhs1.usia = 3; // ERROR: usia has protected access in mhs
        System.out.println("Komentar: Property protected TIDAK BISA diakses langsung dari main class");
        System.out.println("Solusi: Gunakan getter/setter -> mhs1.getsemester() = " + mhs1.getsemester());
        mhs1.setusia(20);
        System.out.println("Setelah diubah melalui setter: mhs1.getsemester() = " + mhs1.getsemester());
        
        System.out.println(); // spasi
        
        // Akses property private - TIDAK BISA diakses langsung
        System.out.println("Akses property private (fakultas):");
        // mhs1.fakultas = "Teknik"; // ERROR: fakultas has private access in mhs
        System.out.println("Komentar: Property private TIDAK BISA diakses langsung dari main class");
        System.out.println("Solusi: Gunakan getter/setter -> mhs1.getprodi() = " + mhs1.getprodi());
        mhs1.setfakultas("Teknik");
        System.out.println("Setelah diubah melalui setter: mhs1.getprodi() = " + mhs1.getprodi());
        
        System.out.println(); // spasi
        
        // Menampilkan informasi akhir
        System.out.println("4. INFORMASI AKHIR OBJECT:");
        System.out.println("--- mhs1 ---");
        mhs1.tampilkanInfo();
        System.out.println("\n--- mhs2 ---");
        mhs2.tampilkanInfo();
    }
}

class mhs {
    // Properties dengan visibility berbeda
    public String nama;          // public - bisa diakses dari mana saja
    protected int usia;          // protected - bisa diakses dalam package dan subclass
    private String fakultas;       // private - hanya bisa diakses dalam class ini
    
    // Constructor 1: Default constructor
    public mhs() {
        this.nama = "Tidak Diketahui";
        this.usia = 0;
        this.fakultas = "Tidak Diketahui";
        System.out.println("Object mhs dibuat dengan constructor default");
    }
    
    // Constructor 2: Constructor dengan parameter
    public mhs(String nama, int usia, String fakultas) {
        this.nama = nama;
        this.usia = usia;
        this.fakultas = fakultas;
        System.out.println("Object mhs dibuat dengan constructor parameter");
    }
    
    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("usia: " + usia);
        System.out.println("fakultas: " + fakultas);
    }
    
    // Getter untuk properti private
    public String getprodi() {
        return fakultas;
    }
    
    // Setter untuk properti private
    public void setfakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    // Getter untuk properti protected
    public int getsemester() {
        return usia;
    }
    
    // Setter untuk properti protected
    public void setusia(int usia) {
        this.usia = usia;
    }
}