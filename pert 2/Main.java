public class Main{
    public static void main(String[] args){
        Person person1 = new Person("Daffa", 25,"jl.jambu");
        person1.displayInfo();

        person1.setName("dapoy");
        person1.setAge(15);
        person1.setAddress("jalan.in aja");

        System.out.println("udah gua ubah ni: ");
        person1.displayInfo();
    }
}