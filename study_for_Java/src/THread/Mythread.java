package THread;
//定义一个类继承Thread
public class Mythread extends Thread{
    //重写Thread的run方法(封装线程的方法)

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(getName()+" "+i);
        }
    }
}
