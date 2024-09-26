public class Cemeng extends Binatang {
    public Cemeng (String nama){
        super(nama);
    }

    @Override
    public void bersuara(){
        System.out.println(this.nama+"Meoong");
    }
}