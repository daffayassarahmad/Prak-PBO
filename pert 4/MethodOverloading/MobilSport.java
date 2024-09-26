public class MobilSport{
    private String nama;

    public MobilSport(String nama){
        this.nama=nama;
    }

    public void gigi(int g){
        System.out.println(this.nama+" Masuk gigi ke-"+ g);
    }

    public void gigi(int g,int t){
        System.out.println(this.nama + "Masuk gigi ke-" + g + "dengan turbo " + t);
    }
}