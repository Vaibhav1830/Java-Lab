public class Threads {
    static class BMSDisplayThread extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("BMS College of Engineering");
                    Thread.sleep(10000);  // Sleep for 10 seconds
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    static class CSEDisplayThread extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("CSE");
                    Thread.sleep(2000);  // Sleep for 2 seconds
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        BMSDisplayThread bmsThread = new BMSDisplayThread();
        CSEDisplayThread cseThread = new CSEDisplayThread();
        System.out.println("Vaibhav Dhar");
        System.out.println("1BM23CD068");
        bmsThread.start();
        cseThread.start();
    }
}
