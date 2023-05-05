public class Parcheggio {
    private Veicolo[] posti;

    public Parcheggio() {
        this.posti = new Veicolo[12];
    }

    public boolean parcheggiaVeicolo(Veicolo v, int posto) {
        if (posto >= 0 && posto < posti.length && posti[posto] == null && v instanceof Auto || v instanceof Moto || v instanceof Furgone) {
            posti[posto] = v;
            return true;
        } else {
            return false;
        }
    }

    public Veicolo prelevaVeicolo(int posto) {
        if (posto >= 0 && posto < posti.length && posti[posto] != null) {
            Veicolo v = posti[posto];
            posti[posto] = null;
            return v;
        } else {
            return null;
        }
    }

    public String stampaSituazione() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < posti.length; i++) {
            sb.append("Posto " + i + ": ");
            if (posti[i] == null) {
                sb.append("vuoto");
            } else {
                sb.append(posti[i].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
