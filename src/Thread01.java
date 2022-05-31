/**
 * ThreadWithClass 와 ThreadWithRunnable 을 실행할 클래스
 * */
public class Thread01 {

    public static void main(String[] args){
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2 = new Thread(new ThreadWithRunnable());

        // 두 스레드들은 비동기적으로 순서없이 실행된다.
        thread1.start();
        thread2.start();
    }
}
