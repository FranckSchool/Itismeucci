/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
       int [] numeri = new int[10];
       int totale = 0;

       for(int i = 0;  i < numeri.length; i++){

        numeri[i] = 1;

       }

        MyThread t1 = new MyThread(numeri, 0, 5);
        MyThread t2 = new MyThread(numeri, 5, 10);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Errore");
        }
        
        totale = t1.getSomma() + t2.getSomma();

        System.out.println("il totale è: " + totale);
    
    }
}