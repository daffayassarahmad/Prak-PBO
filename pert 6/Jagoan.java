class Jagoan {
    private String nama;
    private int kesehatanDasar;
    private int seranganDasar;
    private int penambahanKesehatan;
    private int penambahanSerangan;
    private int tingkat;
    private int totalKerusakan;
    
    private Jubah jubah;
    private Senjata senjata;

    public Jagoan(String nama) {
        this.nama = nama;
        this.kesehatanDasar = 100;
        this.seranganDasar = 100;
        this.tingkat = 1;
        this.penambahanKesehatan = 20;
        this.penambahanSerangan = 20;
    }

    public String getNama() {
        return this.nama;
    }

    public int getKesehatan() {
        return this.kesehatanMaksimal() - this.totalKerusakan;
    }

    public void tampilkan() {
        System.out.println("Jagoan\t\t: " + this.nama);
        System.out.println("Kesehatan\t: " + this.getKesehatan() + "/" + this.kesehatanMaksimal());
        System.out.println("Serangan\t: " + this.getDayaSerang());
        System.out.println("Jubah\t\t: " + this.jubah.getNama());
        System.out.println("Senjata\t\t: " + this.senjata.getNama() + "\n");
    }

    public void serang(Jagoan lawan) {
        int kerusakan = this.getDayaSerang();
        System.out.println(this.nama + " menyerang " + lawan.getNama() + " dengan " + kerusakan);
        lawan.bertahan(kerusakan);
    }

    public void bertahan(int kerusakan) {
        int dayaBertahan = this.jubah.getDayaPertahanan();
        int deltaKerusakan;

        System.out.println(this.nama + " daya pertahanan = " + dayaBertahan);
        deltaKerusakan = kerusakan - dayaBertahan;
        System.out.println("Kerusakan yang diterima = " + deltaKerusakan + "\n");

        this.totalKerusakan += deltaKerusakan;
    }

    private int getDayaSerang() {
        return this.seranganDasar + this.tingkat * this.penambahanSerangan + this.senjata.getDayaSerang();
    }

    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int kesehatanMaksimal() {
        return this.kesehatanDasar + this.tingkat * this.penambahanKesehatan + this.jubah.getPenambahanKesehatan();
    }
}