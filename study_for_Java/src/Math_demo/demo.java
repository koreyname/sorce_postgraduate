package Math_demo;
import java.util.Random;

public class demo {
    //常用API
    //public static double/int/float abs(double/int/float a)
    //public static double ceil(double a)向上取整
    //public static double floor(double a)向下取整
    //public static double pow(double a,double b)平方
//    public static double random()产生一个[0.0,1.0)的数
public static void main(String []args)
{
    double a=-1.22;
    System.out.println(Math.abs(a));
    System.out.println(Math.ceil(Math.abs(a)));
    System.out.println(Math.floor(Math.abs(a)));
    System.out.println((int)Math.pow(2,3));
    System.out.println(Math.random());
}

}
