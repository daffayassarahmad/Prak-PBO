public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Anjing Saya Sedang bermain bola");
    }

    @Override
    public void eat() {
        System.out.println("memakan tulang");
    }
    
    @Override
    public void walk() {
        System.out.println("berjalan santai di CFD bersama majikan");
    }
}