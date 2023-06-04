package ERROR;

public class demo {
    public static void main(String[] args) {
        //try_catch
        try
        {
            int a=2;
            method(6);
        }
        catch (Exception e)
        {
//            System.out.println("数据不合法");
           String s=e.getMessage();
           s=e.toString();
           e.printStackTrace();
            System.out.println(s);
        }
        //Throwable成员方法
        //getMessage()返回throwable的详细消息字符串
        //toString()返回简短描述
        //printStackTrace() 把异常抛在控制台上

    }
    static void method(int a) throws ArrayIndexOutOfBoundsException
    {
        int []ans={2,3,4};
        if(a>3)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.println(ans[a]);
        }

    }

}
