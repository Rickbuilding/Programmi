/*Creare una classe "Animale" con proprietà "nome" e "numeroZampe". 
Creare due classi figlio "Cane" e "Gatto" che ereditano dalla classe "Animale". 
La classe "Cane" dovrebbe avere un metodo "abbaia" che stampa "Woof!" e la classe "Gatto" dovrebbe avere un metodo "miagola" che stampa "Meow!". Inoltre è presente la classe Uccello con il rispettivo metodo "cinguetta".
Le classi hanno un metodo stampa() che stampa il valore degli attributi.
Creare istanze di "Cane" e "Gatto" e utilizzare i loro metodi per verificare che funzionino correttamente.*/
class Animale {
  String nome;
  int numeroZampe;
  
  public void stampa() {
    System.out.println("Nome: " + nome);
    System.out.println("Numero di zampe: " + numeroZampe);
  }
}

class Cane extends Animale {
  public void abbaia() {
    System.out.println("Woof!");
  }
}

class Gatto extends Animale {
  public void miagola() {
    System.out.println("Meow!");
  }
}

class Uccello extends Animale {
  public void cinguetta() {
    System.out.println("Chirp!");
  }
}
g