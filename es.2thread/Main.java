public class Main {

    public static void main(String[] args) {
        
        int [] arrMain = new int[50];
        int [] risultato = new int[5];
        int somma = 0;

        for(int i = 0; i < 50; i++){

            arrMain[i] = 1;
        }

        MyThread t1 = new MyThread(0, 10, arrMain, 0);
        MyThread t2 = new MyThread(10, 20, arrMain, 0);
        MyThread t3 = new MyThread(20, 30, arrMain, 0);
        MyThread t4 = new MyThread(30, 40, arrMain, 0);
        MyThread t5 = new MyThread(40, 50, arrMain, 0);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();;
            t5.join();
        } catch (Exception e) {
            System.out.println("Errore");
        }

        

            risultato[0] = t1.getResult();
            risultato[1] = t2.getResult();
            risultato[2] = t3.getResult();
            risultato[3] = t4.getResult();
            risultato[4] = t5.getResult();

        for(int i = 0; i < risultato.length; i++){

            somma += risultato[i];
        }

       System.out.println("La somma è: " + somma);
        
    }
}