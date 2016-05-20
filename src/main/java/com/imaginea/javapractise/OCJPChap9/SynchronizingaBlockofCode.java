package OCJPChap9;
//try to remove synchronized(letter) 
//& see the difference
//charAt()
//setCharAt(0,temp);

public class SynchronizingaBlockofCode extends Thread {

    StringBuffer letter;

    public SynchronizingaBlockofCode(StringBuffer letter) {
        this.letter = letter;

    }

    public void run() {
        synchronized (letter) { // #1
            for (int i = 1; i <= 100; ++i) {
                System.out.print(letter);
            }

            System.out.println();

            /**
             * *******incrementing letter***********
             */
            char temp = letter.charAt(0);
            ++temp;					 // Increment the letter in StringBuffer:
            ++temp;
            letter.setCharAt(0, temp);

        } // #2
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("A");
        new SynchronizingaBlockofCode(sb).start();
        new SynchronizingaBlockofCode(sb).start();
        new SynchronizingaBlockofCode(sb).start();
    }
}
