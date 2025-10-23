package bagunan;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO GETTER SETTER TANPA RETURN ===\n");
        
        
        Segitiga segitiga = new Segitiga(10, 5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(8, 4);
        Lingkaran lingkaran = new Lingkaran(7);
        
        
        System.out.println("=== GETTER DEMO ===");
        segitiga.getAlas();
        segitiga.getTinggi();
        System.out.println();
        
        persegiPanjang.getPanjang();
        persegiPanjang.getLebar();
        System.out.println();
        
        lingkaran.getJari2();
        System.out.println();
        
        
        System.out.println("=== SETTER DEMO ===");
        segitiga.setAlas(15);
        segitiga.setTinggi(8);
        System.out.println();
        
        persegiPanjang.setPanjang(12);
        persegiPanjang.setLebar(6);
        System.out.println();
        
        lingkaran.setJari2(10);
        System.out.println();
        
        // Tampilkan info setelah perubahan
        System.out.println("=== INFO SETELAH PERUBAHAN ===");
        segitiga.tampilkanInfo();
        System.out.println();
        
        persegiPanjang.tampilkanInfo();
        System.out.println();
        
        lingkaran.tampilkanInfo();
        System.out.println();
        
        // Demo setter multiple
        System.out.println("=== SETTER MULTIPLE ===");
        segitiga.setSegitiga(20, 10);
        segitiga.tampilkanInfo();
    }
}