public class Main {
    public class main {
        public static void main(String[] args) {
            Veicolo Auto = new Auto("Range Rover", 2017, 3024, 5, "Diesel");
            Veicolo Furgone = new Furgone("Opel", 2018, 1900, 600);
            Veicolo Moto = new Moto("BMW",2021, 250, 2);
            
            System.out.println(Auto.getInfo());
            System.out.println(Furgone.getInfo());
            System.out.println(Moto.getInfo());

        }
    }
}
