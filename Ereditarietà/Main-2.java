public class Main {
    public static void main(String[] args) {
        Parcheggio parcheggio = new Parcheggio();

        // parcheggia un veicolo
        Veicolo v1 = new Auto("Fiat", 2015, 1400, 5, "Benzina");
        int indice = 2;
        boolean posto = parcheggio.parcheggiaVeicolo(v1, indice);
        if(posto) {
            System.out.println("Parcheggiato veicolo " + v1 + " al posto " + indice);
        } else {
            System.out.println("Errore");
        }

        // preleva un veicolo
        Veicolo v2 = parcheggio.prelevaVeicolo(2);
        if (v2 != null) {
            System.out.println("Prelevato veicolo " + v2 + " dal posto 0");
        } else {
            System.out.println("Posto 0 vuoto");
        }

        // stampa situazione parcheggio
        parcheggio.stampaSituazione();
    }
}
