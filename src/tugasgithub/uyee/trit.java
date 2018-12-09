package tugasgithub.uyee;

import java.util.logging.Level;
import java.util.logging.Logger;

public class trit implements Runnable {

    private String name;

    public trit(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        increment();
    }

    private void increment() {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(this.name + " -> " + i);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    Logger.getLogger(trit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}