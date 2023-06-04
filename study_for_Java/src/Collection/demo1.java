package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        //创建collection对象
        Collection<String> c = new ArrayList<String>();
        //添加元素 boolean  add(E e)
        c.add("Hello");
        c.add("World");
        c.add("JAVA");
        System.out.println(c);
        Iterator<String> it=c.iterator();
        while(it.hasNext())//判断是否到结尾
        {
            System.out.println(it.next());//输出
        }
        //boolean remove(Object o)
        c.remove("Hello");

        System.out.println(c);
        //void clear()
        c.clear();
        //boolean isEmpty()
        //int size()
        //boolean contains(Object o)
        System.out.println(c.contains("Hello"));
        //如果此 collection 包含指定的元素，则返回 true。更确切地讲，
        // 当且仅当此 collection 至少包含一个满足 (o==null ? e==null : o.equals(e)) 的元素 e 时，
        // 返回 true
        //输出
        System.out.println(c);
        //boolean isEmpty()
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        //迭代器遍历

    }
}
