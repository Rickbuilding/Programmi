/*Un’agenzia immobiliare organizza il proprio lavoro attraverso un sistema informatico in cui registra
i dati di ogni immobile. La procedura permette di calcolare il valore dell’immobile in funzione dei
mq, della categoria e della vetustà.
Al valore dell’immobile verrà applicato un correttivo in diminuzione in funzione della vetustà
dell’immobile
Creare un programma in Java che contenga la classe Immobile e che preveda i seguenti metodi:
1. Inserimento i dati dell’immobile;
2. Calcolo del valore dell’immobile secondo le seguenti tabelle;
3. Calcolare le tasse di registro pari al 6% sul valore;
4. Calcolare il canone di affitto pari a 7€ al mq + ulteriori 2€ in caso di locale commerciale.
Riccardo Fiorino*/

public class Main{
    public static void clear() {
       try{
               new ProcessBuilder("clear").inheritIO().start().waitFor();
           } catch (Exception e) {
               System.out.print(e);
           }
   }
   public static void main(String[] args) {
       Immobile immobile = new Immobile();
       immobile.init();
       clear();
       System.out.println("Valore totale: " + immobile.getvaloreTot());
       System.out.println("Tasse registro: " + immobile.getTasseRegistro());
       System.out.println("Canone affitto: " + immobile.getCanoneAffitto());
   }
}