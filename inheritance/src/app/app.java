package app;

public class app {
    public static void main(String[] args) throws Exception{
        System.out.println();
        Karyawan Ridho = new Karyawan("123","Ridho");

        Ridho.getInfo();
        Ridho.AbsenPagi();
        Ridho.Kerja();
        Ridho.AbsenPulang();
        
        System.out.println();
        Dosen Amir = new Dosen("124", "45", "Amir");
        System.out.println();
        
        Amir.getInfo();
        Amir.AbsenPagi();
        Amir.Kerja();
        Amir.ngajar();
        Amir.AbsenPulang();
    }
}
