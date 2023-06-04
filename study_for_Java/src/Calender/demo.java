package Calender;

import java.util.Calendar;

/*
public abstract class Calendar
extends Objectimplements Serializable, Cloneable, Comparable<Calendar>Calendar
 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，
 并为操作日历字段（例如获得下星期的日期）提供了一些方法。瞬间可用毫秒值来表示，
 它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高利历）的偏移量。


 */
public class demo {
    public static void main(String[] args) {
        //获取对象
        Calendar c=Calendar.getInstance();//多态形式得到
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;//MONTH从零开始
        int day=c.get(Calendar.DATE);
        System.out.println(year+" "+month+" "+day);
        //calender.add();
        c.add(Calendar.YEAR,-3);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH)+1;//MONTH从零开始
        day=c.get(Calendar.DATE);
        System.out.println(year+" "+month+" "+day);
    }
}
