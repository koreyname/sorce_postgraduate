package String;
import java.util.*;

public class String_modle {
    public static void main(String[] args) {
        //String特点
        //内容不可更改(对于堆栈而言，不可改变的原因是指常量区的数据无法更改，只能在常量池中新建对象才可以改变数值)
        //创建方法a
        //public String();
        String s=new String();
//        public String(char []ch)
    char[] ch={'a','b','c'};
        //        public String(byte []by)
    byte[] by={97,98,99};
        String s2=new String(by);
        System.out.println(s2);
    }
}
