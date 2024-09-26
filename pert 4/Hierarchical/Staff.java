public class Staff{
    protected String nama;

    public Staff(String nama){
        this.nama=nama;
    }

    public void kerja(){
        System.out.println(this.nama+"bantu dosen");
    }
}