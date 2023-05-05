public class ContoCorrente {
  private double saldo; // variabile d'istanza per il saldo del conto

  // Costruttore per inizializzare il saldo del conto
  public ContoCorrente(double saldoIniziale) {
    this.saldo = saldoIniziale;
  }

  // Metodo per depositare fondi sul conto
  public void deposita(double importo) {
    this.saldo += importo;
  }

  // Metodo per prelevare fondi dal conto
  public void preleva(double importo) {
    if (importo > this.saldo) {
      System.out.println("Saldo insufficiente");
    } else {
      this.saldo -= importo;
    }
  }

  // Metodo per visualizzare il saldo del conto
  public double saldo() {
    return this.saldo;
  }

  // Metodo per effettuare un bonifico bancario ad un altro conto
  public void trasferisci(ContoCorrente destinatario, double importo) {
    if (importo > this.saldo) {
      System.out.println("Saldo insufficiente");
    } else {
      this.preleva(importo);
      destinatario.deposita(importo);
    }
  }
}
