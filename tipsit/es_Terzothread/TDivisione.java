package tipsit.es_Terzothread;

public class TDivisione extends Thread {

    double primo;
    double secondo;
    double result;

    public TDivisione(double n1, double n2){

        this.primo = n1;
        this.secondo = n2;
        this.result =  result;

    }


    public double getPrimo() {
        return primo;
    }

    public void setPrimo(double primo) {
        this.primo = primo;
    }

    public double getSecondo() {
        return secondo;
    }

    public void setSecondo(double secondo) {
        this.secondo = secondo;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


    @Override
    public synchronized void  run() {
        
        if(secondo == 0){

            System.out.println("ERRORE: Non puoi dividere per 0");
            return;
        }
        result = primo / secondo;
        System.out.println("Il risultato della divisione è: " + result);

        super.run();
    }
    
}
