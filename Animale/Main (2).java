/*Creare una classe "Animale" con proprietà "nome" e "numeroZampe". 
Creare due classi figlio "Cane" e "Gatto" che ereditano dalla classe "Animale". 
La classe "Cane" dovrebbe avere un metodo "abbaia" che stampa "Woof!" e la classe "Gatto" dovrebbe avere un metodo "miagola" che stampa "Meow!". Inoltre è presente la classe Uccello con il rispettivo metodo "cinguetta".
Le classi hanno un metodo stampa() che stampa il valore degli attributi.
Creare istanze di "Cane" e "Gatto" e utilizzare i loro metodi per verificare che funzionino correttamente.*/
public class Main {
  public static void main(String[] args) {
    Cane cane = new Cane();
    cane.nome = "Fido";
    cane.numeroZampe = 4;
    cane.stampa();
    cane.abbaia();
    
    Gatto gatto = new Gatto();
    gatto.nome = "Miao";
    gatto.numeroZampe = 4;
    gatto.stampa();
    gatto.miagola();
    
    Uccello uccello = new Uccello();
    uccello.nome = "Pio";
    uccello.numeroZampe = 2;
    uccello.stampa();
    uccello.cinguetta();
  }
}
