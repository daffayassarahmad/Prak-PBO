public class Main {
    public static void main(String[] args) throws Exception {
        Spider labalaba = new Spider();
        labalaba.eat();

        Dog dog = new Dog();
        dog.setName("Oren");
        System.out.println("Name Dog : " + dog.getName());
        dog.play();
        dog.eat();
        dog.walk();

        Cat oren = new Cat("Ujang");
        System.out.println("Name Cat :  " + oren.getName());
        oren.play();
        oren.eat();
        oren.walk();
       
    }
}