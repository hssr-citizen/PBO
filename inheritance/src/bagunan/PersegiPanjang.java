package bagunan;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;
    
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void tampilkanKeliling() {
        float keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
    
    public void tampilkanLuas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    
    public void tampilkanInfo() {
        System.out.println("=== INFO PERSEGI PANJANG ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        tampilkanLuas();
        tampilkanKeliling();
        System.out.println("===========================");
    }
    
    
    public void getPanjang() {
        System.out.println("Panjang Persegi Panjang: " + panjang);
    }
    
    public void getLebar() {
        System.out.println("Lebar Persegi Panjang: " + lebar);
    }
    
    
    public void setPanjang(float panjang) {
        this.panjang = panjang;
        System.out.println("Panjang berhasil diubah menjadi: " + panjang);
    }
    
    public void setLebar(float lebar) {
        this.lebar = lebar;
        System.out.println("Lebar berhasil diubah menjadi: " + lebar);
    }
    
    
    public void setPersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Persegi Panjang berhasil diubah - Panjang: " + panjang + ", Lebar: " + lebar);
    }
}