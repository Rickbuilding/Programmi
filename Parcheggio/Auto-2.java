public class Auto extends Veicolo {
    private int porte;
    private String carburante;

    public Auto(String marca, int anno, int cilindrata, int porte, String carburante) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.carburante = carburante;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String getCarburante() {
        return carburante;
    }

    public void setAlimentazione(String alimentazione) {
        this.carburante = alimentazione;
    }

    @Override
    public String getInfo() {
        return "Auto - Marca: " + getMarca() + ", Anno: " + getAnno() + ", Cilindrata: " + getCilindrata() + ", Porte: " + porte + ", Carburante: " + carburante;
    }
}