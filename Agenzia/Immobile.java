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

import java.util.Scanner;
import java.io.IOException;



public class Immobile {

    Scanner input = new Scanner(System.in);

    private String categoria;
    private int superficie, vestuta, valoreTot = 0;
    private int residenziale = 700, pertinenza = 500, commerciale = 950;
    private int R10v20 = 15, R20 = 27, P10v20 = 10, P20 = 18, C10v20 = 13, C20 = 22;
    
    public void clear() {
        try{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } catch (Exception e) {
                System.out.print(e);
            }
    }
    
    public void init() {
        try{
            System.out.println("Che categoria è l'immobile?\n \nResidenziale\nPertinenza\nCommerciale ");
            System.out.println(" ");
            categoria = input.nextLine();
            setCategoria(categoria.toLowerCase());
            clear();
            System.out.println("Superficie dell'immobile?");
            superficie = input.nextInt();
            setSuperficie(superficie);
            clear();
            System.out.println("Percentuale di vestuta dell'immobile?");
            vestuta = input.nextInt();
            setVestuta(vestuta);
        }catch(Exception e){
            System.out.println("Errore: " + e);
        }
    }

    private void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    private void setVestuta(int vestuta) {
        if(vestuta <= 30) {
            this.vestuta = vestuta;
        }
    }
    private void setCategoria(String cat) {
        if(cat.equals("residenziale") || cat.equals("pertinenza") || cat.equals("commerciale")) {
            this.categoria = cat;
        }
    }

    public int getvaloreTot() {
        if (valoreTot == 0){
            setvaloreTot();
        }
        return valoreTot;
    }

    private void setvaloreTot() {
        int val = 0;
        if(categoria.equals("residenziale")) {
            val = (superficie * residenziale);
            val = calcCorrettivoVestuta(val); 
        } else if(categoria.equals("pertinenza")) {
            val = (superficie * pertinenza);
            val = calcCorrettivoVestuta(val);
        } else if(categoria.equals("commerciale")) {
            val = (superficie * commerciale);
            val = calcCorrettivoVestuta(val);
        }
        valoreTot = val;
    }

    private int calcCorrettivoVestuta(int valore) {
        try{
            if(vestuta >= 10 && vestuta < 20) {
                if(categoria.equals("residenziale")) {
                    valore -= (valore/100) * R10v20;
                } else if(categoria.equals("pertinenza")) {
                    valore -= (valore/100) * P10v20;
                } else if(categoria.equals("commerciale")) {
                    valore -= (valore/100) * C10v20;
                }
            } else if(vestuta >= 20 && vestuta <= 30) {
                if(categoria.equals("residenziale")) {
                    valore -= (valore/100) * R20;
                } else if(categoria.equals("pertinenza")) {
                    valore -= (valore/100) * P20;
                } else if(categoria.equals("commerciale")) {
                    valore -= (valore/100) * C20;
                }
            }
            return valore;
        } catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getTasseRegistro() {
        if(valoreTot == 0){
            setvaloreTot();
        }
        try{
            return (valoreTot * 6) / 100;
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

    public int getCanoneAffitto() {
        if(valoreTot == 0){
            setvaloreTot();
        }
        try{
            if(categoria.equals("residenziale") || categoria.equals("pertinenza")) {
                return superficie * 7;
            } else if(categoria.equals("commerciale")) {
                return superficie * 9;
            } else {
                return 0;
            }
        }catch(Exception e) {
            System.out.println("Errore: " + e);
            return 0;
        }
    }

}