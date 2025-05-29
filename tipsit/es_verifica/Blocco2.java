package tipsit.es_verifica;

//Calcola 5b - 7
public class Blocco2 extends Thread{
    //Dichiarazione variabili
    int b;
    int result;

    //Costruttore
    public Blocco2(int b){

        this.b = b;
        result = 0;

    }

    //Metodo run per l'esecuzione
    @Override
    public void run() {
        
        result = 5 * b;
        result =  result - 7;
        System.out.println("\nIl blocco 2 risulta:" + result);
        super.run();
    }

    public int getResult() {
        return result;
    }
    
}
