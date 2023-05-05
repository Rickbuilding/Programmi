public class Moto extends Veicolo {
    private String tempi;

    public Moto(String marca, int anno, int cilindrata, String tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    public String getTempi() {
        return tempi;
    }

    public void setTempi(String tempi) {
        this.tempi = tempi;
    }

    @Override
    public String toString() {
        return "Moto [marca=" + getMarca() + ", anno=" + getAnno() + ", cilindrata=" + getCilindrata() + ", tempi=" + tempi + "]";
    }
}
