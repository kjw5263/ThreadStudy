/**
 *  Runnable 인터페이스를 상속받아서 스레드 구현체를 정의
 * */
public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
