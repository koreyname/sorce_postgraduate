# Java基础

## Java输入输出

> Scanner类
>
> 

```java
class Main{
public static void main(String[],args)
{
    int a;
    double b;
    String c;
    Scanner input = new Scanner(System.in)//实例化Scanner类对象；
        a=input.nextInt();//输入整数
        b=input.nextDouble()//输入浮点数
        c=input.next();输入字符串
        System.out.println(a);//a==输入的值
}
}
```

输出：

> - print::无换行输出
> - println::换行输出
> - printf::格式化输出---类比c/c++;

