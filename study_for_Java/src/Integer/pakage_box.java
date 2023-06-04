package Integer;

public class pakage_box {
    public static void main(String[] args) {
        //装箱，将基本数据类型转换成类
        Integer k=Integer.valueOf(100);//装箱
        Integer i=100;//自动装箱，JDK5后的简化
        //拆箱，将类转换成基本数据类型
        int p=k.intValue();//拆箱
        p+=100;
        k+=200;//自动拆箱和自动装箱
        System.out.println(k);

    }
}
