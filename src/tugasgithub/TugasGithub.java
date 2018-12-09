package tugasgithub;

import tugasgithub.uyee.trit;

public class TugasGithub {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new trit("thread: " + i)).start();
        }
    }
}
