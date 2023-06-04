package UnName;
/*
格式
new 类名或者接口名()
{
重写方法
}
 */
/*
前提:存在一个类或者是接口
 */
public class demo {
//    public void method()
//    {
////       new Inter()//若想调用多次，就只需要多次循环即可
////        {
////            public void show()
////            {
////                System.out.println("匿名内部类实现了");
////            }
////        }.show();//对象调用了show方法
//       Inter i= new Inter()
//        {
//            public void show()
//            {
//                System.out.println("匿名内部类实现了");
//            }
//        };
//       i.show();
//       //多次调用
//        i.show();
//    }

    public static void main(String[] args) {
       new Inter()
        {
            public void show()
            {
                System.out.println("你好，匿名内部类实现了");
            }
        }.show();
    }

}
