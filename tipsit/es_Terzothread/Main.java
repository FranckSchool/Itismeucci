
package tipsit.es_Terzothread;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner crazy = new Scanner(System.in);
        
        System.out.println("Inserire primo numero");
        double n1 = crazy.nextDouble();

        System.out.println("Inserire secondo numero");
        double n2 = crazy.nextDouble();

        crazy.close();

        TSomma somma = new TSomma(n1, n2);
        TSottrazione sottrazione =  new TSottrazione(n1, n2);
        TMoltiplicazione moltiplicazione = new TMoltiplicazione(n1, n2);
        TDivisione divisione =  new TDivisione(n1, n2);
         
        somma.start();
        sottrazione.start();
        moltiplicazione.start();
        divisione.start(); 

        try {
            somma.join();
            sottrazione.join();
            moltiplicazione.join();
            divisione.join();
        } catch (Exception e) {
            System.out.println("ERRORE");
        }
     
    }
}