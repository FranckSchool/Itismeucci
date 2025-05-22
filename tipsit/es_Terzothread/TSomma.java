package tipsit.es_Terzothread;

public class TSomma extends Thread {
    
    double primo;
    double secondo;
    double result;

    public TSomma(double n1, double n2){

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
    public synchronized void run() {
        

        result = primo + secondo;
        System.out.println("Il risultato della somma è: " + result);

        super.run();
    }
}
