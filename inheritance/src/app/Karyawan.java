package app;

public class Karyawan {

protected String KodeKaryawan;
protected String Name;

public Karyawan(String KodeKaryawan, String Name){
    this.KodeKaryawan = KodeKaryawan;
    this.Name = Name;
}

public void AbsenPagi(){System.out.println(this.Name + ": Absen pagi");}
public void Kerja(){System.out.println(this.Name + ": Sedang Kerja");}
public void AbsenPulang(){System.out.println(this.Name + ": Absen pulang");}

public void getInfo(){
    System.out.println("Kode Karyawan : " + this.KodeKaryawan);
    System.out.println("Name : " + this.Name);
}
}