public class Main {
    public static void main(String[] args) {
        Karyawan ridho = new Karyawan("12345", "Ridho");
        ridho.getInfo();
        ridho.absenPagi();
        ridho.kerja();
        ridho.absenPulang();

        Dosen andiani = new Dosen("23455", "332211", "Andiani");
        andiani.getInfo(); 
        andiani.absenPagi();
        andiani.ngajar();
        andiani.absenPulang();

        Karyawan melan = new Karyawan("12346", "Melan");
        melan.getInfo();
        melan.absenPagi();
        melan.kerja();
        melan.absenPulang();

        Dosen ion = new Dosen("23456", "332212", "Ionia");
        ion.getInfo(); 
        ion.absenPagi();
        ion.ngajar();
        ion.absenPulang();
    }
}