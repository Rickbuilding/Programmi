public class Auto extends Veicolo {
    private int porte;
    private String alimentazione;

    public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + getMarca() + ", anno=" + getAnno() + ", cilindrata=" + getCilindrata() + ", porte=" + porte
                + ", alimentazione=" + alimentazione + "]";
    }
}
