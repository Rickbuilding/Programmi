public class Main {
  public static void main(String[] args) {
    ContoCorrente mioConto = new ContoCorrente(1000.0);
    ContoCorrente altroConto = new ContoCorrente(500.0);

    System.out.println("Saldo iniziale del mio conto: " + mioConto.saldo());
    System.out.println("Saldo iniziale dell'altro conto: " + altroConto.saldo());

    mioConto.deposita(100.0);
    System.out.println("Saldo dopo deposito sul mio conto: " + mioConto.saldo());

    mioConto.preleva(200.0);
    System.out.println("Saldo dopo prelievo sul mio conto: " + mioConto.saldo());

    mioConto.trasferisci(altroConto, 50.0);
    System.out.println("Saldo dopo bonifico sul mio conto: " + mioConto.saldo());
    System.out.println("Saldo dopo bonifico sull'altro conto: " + altroConto.saldo());
  }
}
