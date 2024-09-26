public class Kucing extends Binatang {
    public Kucing (String nama){
        super(nama);
    }

    @Override
    public void bersuara(){
        System.out.println(this.nama+"Ngeoong");
    }
}