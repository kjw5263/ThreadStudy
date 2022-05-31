/**
 * ThreadWithClass 와 ThreadWithRunnable 을 실행할 클래스
 * 스레드 우선순위를 지정해 작업 처리의 실행 우선순위를 확인한다.
 * 두번째 스레드가 메모리에 더 많이 할당되어 우선순위가 높아질 뿐
 * 무조건 첫번째로 되거나 작업완료 속도가 더 빠른것은 아니다.
 * */
public class Thread02 {
    public static void main(String[] args){
        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10);    // thread2를 최상위 우선순위로 지정한다

        thread1.start();
        thread2.start();

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
    }
}
