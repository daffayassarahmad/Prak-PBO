abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("sadang berjalan");
    }

    public void play(){
        System.out.println("sedang bermain");
    }

    public abstract void eat();
}