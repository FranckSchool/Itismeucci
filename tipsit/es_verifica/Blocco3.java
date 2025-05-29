package tipsit.es_verifica;


//calcola 8 -3c
public class Blocco3 extends Thread{
    //Dichiarazione variabili
    int c;
    int result;

    //Costruttore
    public Blocco3(int c){

        this.c = c;
        result = 0;
    }

    //Metodo run per l'esecuzione
    @Override
    public void run() {
        
        result = 3 * c;
        result = 8 - result;
        System.out.println("\nIl blocco 3 risulta:" + result);
        super.run();
    }
    
    public int getResult() {
        return result;
    }
}
