package Date;
import java.util.*;
public class demo {
    public static void main(String[] args) {
       Date date=new Date();
        //getTime public long getTime()返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        //setTime public void setTime(long time)设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
        System.out.println(date.getTime()*1.0/1000/60/60/24/365);
    }
}
