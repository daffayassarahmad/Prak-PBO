public class Spider extends Animal {
    public Spider() {
        super(8);
        System.out.println("Saya adalah seekor Laba-laba");
    }

    @Override
    public void eat() {
        System.out.println("Laba-laba Sedang makan");
    }
}