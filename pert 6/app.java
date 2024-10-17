

class Jagoan {
    private String nama;
    private int kesehatanDasar;
    private int kekuatanDasar;
    private Jubah jubah; // asosiasi
    private Senjata senjata; // asosiasi
    private int derajat;
    // private int kenaikanKekuatan;
    // private int kenaikanKesehatan;

    public Jagoan(String nama) {
        this.nama = nama;
        this.kesehatanDasar = 100;
        this.kekuatanDasar = 100;
        this.derajat = 1;
        // this.kenaikanKekuatan = 20;
        // this.kenaikanKesehatan = 20;
    }
    
    public void naikDerajat() {
        this.derajat++;
    }

    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int sehatMaksimal() {
        return this.kesehatanDasar + this.jubah.getTambahKesehatan();
    }

    public int getKekuatanMaksimal() {
        return this.kekuatanDasar + this.senjata.getKekuatanSerang();
    }

    public void info() {
        System.out.println("Jagoan\t\t\t: " + this.nama);
        System.out.println("Derajat\t\t\t: " + this.derajat);
        System.out.println("Kesehatan Dasar\t\t: " + this.kesehatanDasar);
        System.out.println("Kekuatan Dasar\t\t: " + this.kekuatanDasar);
        System.out.println("Jubah\t\t\t: " + this.jubah.getNama());
        System.out.println("Senjata\t\t\t: " + this.senjata.getNama());
        System.out.println("Kesehatan Maksimal\t: " + this.sehatMaksimal());
        System.out.println("Kekuatan Maksimal\t: " + this.getKekuatanMaksimal() + "\n");
    }
}


class Jubah {
    private String nama;
    private int kesehatan;

    public Jubah(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTambahKesehatan() {
        return this.kesehatan * 10;
    }
}


class Senjata {
    private String nama;
    private int kekuatan;

    public Senjata(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getKekuatanSerang() {
        return this.kekuatan * 2;
    }
}


public class app {
    public static void main(String[] args) {
        Jagoan pitung = new Jagoan("Pitung");
        Jubah bajuKoko = new Jubah("Baju Koko", 5);
        Senjata golok = new Senjata("Golok", 50);

        pitung.setJubah(bajuKoko);
        pitung.setSenjata(golok);

        pitung.info();

        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah bajuUlar = new Jubah("Baju Ular", 100);
        Senjata kapak = new Senjata("Kapak", 75);

        jakaSembung.setJubah(bajuUlar);
        jakaSembung.setSenjata(kapak);

        jakaSembung.info();

        Jagoan wiroSableng = new Jagoan("Wiro Sableng");
        Jubah kenconoGeni = new Jubah("Kencono Geni", 200);
        Senjata nagaGeni = new Senjata("Kapak Naga Geni", 100);

        wiroSableng.setJubah(kenconoGeni);
        wiroSableng.setSenjata(nagaGeni);

        wiroSableng.info();
    }
}