package tipsit.es_verifica;

// Calcola 3 + 2a
public class Blocco1 extends Thread{
    //Dichiarazione variabili
    int a;
    int result;

    //Costruttore
    public Blocco1(int a){

        this.a = a;
        result = 0;
    }

    //Metodo run per l'esecuzione
    @Override
    public void run() {
        
        result = 2 * a;
        result += 3;
        System.out.println("\nIl blocco 1 risulta:" + result);
        super.run();
    }


    public int getResult() {
        return result;
    }
    
}
