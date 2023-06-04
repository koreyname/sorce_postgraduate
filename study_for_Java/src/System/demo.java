package System;
//system的方法均静态化了，无需创建对象

import java.util.Random;

public class demo {
    public static void main(String[] args) {
       //public static void exit(int status)
//        public static long currentTimeMillis()返回以毫秒为单位的当前时间。
//        注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间。
//        System.exit(0);//终止虚拟机？
//
//        System.out.println((System.currentTimeMillis()/1000/60/60%24));
//        System.out.println((System.currentTimeMillis()/1000/60%60));
//        System.out.println((System.currentTimeMillis()/1000%60));
        long start=System.currentTimeMillis();
        System.out.println("执行中。。。。");

        long k=10000000;
        while(k>0)
        {
            k--;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start+"毫秒");

    }

}
