package THread;

public class demo {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
//        mythread.run();
        //单线程
        mythread.setName("第一个");
        Mythread mythread1=new Mythread();
//        mythread1.run();
        mythread1.setName("第二个");
        mythread.start();//多线程，执行run方法
        mythread1.start();
    }
}
