public class MyThread extends Thread {
    

    private int inizio;
    private int fine;
    private int [] arr;
    private int somma;
    private int  result;

    public MyThread(int inizio, int fine, int [] arr, int result){

        this.inizio = inizio;
        this.fine = fine;

        this.arr = arr;
        
    }

    public int getInizio() {
        return inizio;
    }

    public int getFine() {
        return fine;
    }

    public int[] getArr() {
        return arr;
    }

    public void setInizio(int inizio) {
        this.inizio = inizio;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSomma() {
        return somma;
    }

    public void setSomma(int somma) {
        this.somma = somma;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    //METODI

    @Override
    public void run(){

        for(int i = inizio; i < fine; i++){

            this.result += arr[i];
        }

    }

    

   
}
