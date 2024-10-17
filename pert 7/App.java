public class App{
    public static void main(String[] args)throws Exception {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();

        d.bicara();

        MOuter that = new MOuter();
        that.go((int)(Math.random()*100), (int)(Math.random()*100));
    }
}