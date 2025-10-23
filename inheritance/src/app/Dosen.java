package app;

class Dosen extends Karyawan{
    private String NIDN;

    public Dosen (String KodeKaryawan, String NIDN, String Name){
        super(KodeKaryawan, Name);
        this.NIDN = NIDN;
    }
        
public void setNIDN(String NIDN){
    this.NIDN = NIDN;
} 

public void getNIDN(){System.out.println("NIDN : " + this.NIDN);}
public void ngajar(){System.out.println(this.Name + " : sedang mengajar");}
@Override
public void getInfo(){
    super.getInfo();
    System.out.println("NIDN : " + this.NIDN);
}
    }


