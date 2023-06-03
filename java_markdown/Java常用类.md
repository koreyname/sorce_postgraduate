# java常用类的c以及相应方法

## String 类

> string类中，常用的方法有
>
> - toUpperCase--将字符串全转大写；
> - toLowerCase---将字符串全转小写；
> - length--获取字符串长度
> - Interger类中的方法---字符串转数字
> - toString()----数字转字符串

```java
package String类;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String a;
        a=input.nextLine();
        System.out.println("The string is "+a);
        a=a.toUpperCase();
        System.out.println("The string is "+a);
        a=a.toLowerCase();
        System.out.println("The string is "+a);
        System.out.println("The string's length is "+a.length());

    }

}

```



```java
package String类;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        String a="123";
        Integer num=new Integer(a);
        System.out.println(num);
        String b="90";
        num=Integer.parseInt(b);
        System.out.println(num);
        String c=num.toString();
        System.out.println(c);
    }

}

```

