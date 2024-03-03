package Miscellenous;

class AnnonymousClass implements Runnable{

    public static void main(String[] args) {

        AnnonymousClass functionlInterfaceExample=new AnnonymousClass();
        functionlInterfaceExample.run();

        //Annonymous inner class
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("From Annonymous inner class");
            }
        });
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello from the main method!");

        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World Old");
            }
        }).start();

        //new way- lambda expression to its functional interface
        new Thread(()-> System.out.println("Hello World lambda")).start();

    }

    @Override
    public void run() {
        System.out.println("Traditional way of running a thread");
    }
}
