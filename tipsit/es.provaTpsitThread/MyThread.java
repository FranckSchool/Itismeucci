public class MyThread extends Thread {


    private int inizio;
    private int fine;
    private int [] numeri;
    private int somma;

    public MyThread(int[]numeri, int inizio, int fine){

        this.numeri = numeri;
        this.inizio = inizio;
        this.fine = fine;
        
    }

//GET e SET


    public int getInizio() {
        return inizio;
    }





    public void setInizio(int inizio) {
        this.inizio = inizio;
    }





    public int getFine() {
        return fine;
    }





    public void setFine(int fine) {
        this.fine = fine;
    }





    public int[] getNumeri() {
        return numeri;
    }





    public void setNumeri(int[] numeri) {
        this.numeri = numeri;
    }


      public int getSomma() {
            return somma;
        }

        public void setSomma(int somma) {
            this.somma = somma;
        }


    

    //METODI

        @Override
    public void run(){

        for(int i = 1; i <= fine; i++){

           somma += numeri[i];

           try {

            sleep(900);
            
           } catch (Exception e) {
                System.out.println("Errore");
           }

        }
    }

      

}

