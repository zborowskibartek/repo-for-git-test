package thread;

public class LearnThread {

    public final static int number = 10;


    private int checkStaticField() {
        return number;
    }

    public static void main(String[] args) {

        LearnThread lt = new LearnThread();
        System.out.println(lt.checkStaticField());

        int n1 = number;
        Thread tr1 = new Thread();
        Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(tr1);
            }
        });

        tr1.start();
        tr2.start();

        System.out.println(tr1);

    }

}
