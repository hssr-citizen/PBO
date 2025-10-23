package bagunan;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void tampilkanKeliling() {
        float sisiMiring = (float) Math.sqrt((alas/2)*(alas/2) + tinggi*tinggi);
        float keliling = alas + (2 * sisiMiring);
        System.out.println("Keliling Segitiga: " + keliling);
    }
    
    public void tampilkanLuas() {
        float luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
    
    public void tampilkanInfo() {
        System.out.println("=== INFO SEGITIGA ===");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        tampilkanLuas();
        tampilkanKeliling();
        System.out.println("=====================");
    }
    
    
    public void getAlas() {
        System.out.println("Alas Segitiga: " + alas);
    }
    
    public void getTinggi() {
        System.out.println("Tinggi Segitiga: " + tinggi);
    }
    

    public void setAlas(float alas) {
        this.alas = alas;
        System.out.println("Alas berhasil diubah menjadi: " + alas);
    }
    
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
        System.out.println("Tinggi berhasil diubah menjadi: " + tinggi);
    }
    

    public void setSegitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        System.out.println("Segitiga berhasil diubah - Alas: " + alas + ", Tinggi: " + tinggi);
    }
}