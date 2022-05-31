/**
 * Thread 클래스를 상속받아 구현한 스레드 클래스
 * */
public class ThreadWithClass extends Thread{
    /**
     * Thread - run() 메소드에서 작업 구현
     * */
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName());  // 쓰레드 이름 반환
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

