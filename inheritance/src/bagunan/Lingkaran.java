package bagunan;

public class Lingkaran extends BangunDatar {
    private float jari2;
    
    public Lingkaran(float jari2) {
        this.jari2 = jari2;
    }
    
    
    public void tampilkanKeliling() {
        float keliling = 2 * (float) Math.PI * jari2;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    public void tampilkanLuas() {
        float luas = (float) Math.PI * jari2 * jari2;
        System.out.println("Luas Lingkaran: " + luas);
    }
    

    public void tampilkanInfo() {
        System.out.println("=== INFO LINGKARAN ===");
        System.out.println("Jari-jari: " + jari2);
        tampilkanLuas();
        tampilkanKeliling();
        System.out.println("=====================");
    }
    
    // Getter tanpa return - langsung print
    public void getJari2() {
        System.out.println("Jari-jari Lingkaran: " + jari2);
    }
    
    // Setter dengan konfirmasi
    public void setJari2(float jari2) {
        this.jari2 = jari2;
        System.out.println("Jari-jari berhasil diubah menjadi: " + jari2);
    }
}