package tipsit.es_verifica;

import java.util.Scanner;


//Calcola (3 + 2a) * [ (5b - 7) + (8 - 3c) ]
public class Main {

    public static void main(String[] args) {

        //Dichiarazione variabili
        int a = 0;
        int b = 0;
        int c = 0;
        int result = 0;
        
        //Con Scanner si inizializza una variabile per l'imput
        Scanner scan = new Scanner(System.in);

        System.out.println("___CAlCCOLO da fare: (3 + 2a) * [ (5b - 7) + (8 - 3c)___");
        
        //Cattura variabili

        System.out.println("\nInserire valore per a");
        a = scan.nextInt();

        System.out.println("\nInserire valore per b");
        b = scan.nextInt();

        System.out.println("\nInserire valore per c");
        c = scan.nextInt();

        //Creazione Thread

        Blocco1 first = new Blocco1(a);
        Blocco2 second = new Blocco2(b);
        Blocco3 third = new Blocco3(c);


        //Calcoli vari

        try {
            
            //Con il metodo sleep ho impostato che ogni thread entra in funzione ogni secondo
            first.start();
            first.sleep(1000);

            second.start();
            second.sleep(1000);

            third.start();
            third.sleep(1000);
            

            //Con il metodo join si termina il Thread
            first.join();
            second.join();
            third.join();


        } catch (Exception e) {
            //L'eccezione serve per il metodo join
            System.out.println("ERRORE");
        }
        
        Blocco2_3 fourth = new Blocco2_3(second.getResult(), third.getResult());

        try {

            fourth.start();
            fourth.sleep(1000);
            fourth.join();

        } catch (Exception e) {
            //L'eccezione serve per il metodo join
            System.out.println("Errore");
        }
        //Calcolo finale
        result = first.getResult() * fourth.getResult();

        //Stampa finale risultato
        System.out.println("\n___Il risultato è: " + result + " ___");
    }   
}