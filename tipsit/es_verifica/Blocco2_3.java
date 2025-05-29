package tipsit.es_verifica;

//Calcola (5b - 7) + (8 - 3c) 
public class Blocco2_3 extends Thread{
    //Dichiarazione variabili
    int blocco2;
    int blocco3;
    int result;

    //Costruttore
    public Blocco2_3(int blocco2, int blocco3){

        this.blocco2 = blocco2;
        this.blocco3 = blocco3;
        result = 0;
    }


    //Metodo run per l'esecuzione
    @Override
    public void run() {

        result = blocco2 + blocco3;
        System.out.println("\nIl risultato della somma fra blocco 2 e blocco 3: " + result);
        
        super.run();
    }

    public int getResult() {
        return result;
    }

    
}
