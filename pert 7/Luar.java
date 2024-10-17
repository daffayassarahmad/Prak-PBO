public class Luar{
   private String outerVariable="Variabel Luar";

    class Dalam{
        String innerVariable="Variabel Dalam";

        public void bicara(){
            System.out.println(innerVariable);
            System.out.println(outerVariable);
            System.out.println("");
        }

        
    }

}