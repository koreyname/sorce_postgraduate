package ArrayList;
import java.util.ArrayList;
public class ArrayList_demo {
    public static void main(String[] args) {
//        构造方法摘要
//        ArrayList()
        ArrayList<Integer>ans =new ArrayList<Integer>();
//        构造一个初始容量为 10 的空列表。
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(6);
        ans.add(7);
//        ArrayList(Collection<? extends E> c)
//        构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
//        ArrayList(int initialCapacity)
//        构造一个具有指定初始容量的空列表。
        //常用方法
        //public boolean remove(Object o)  删除指定元素，返回是否删除成功
        System.out.println("删除前：ans="+ans);
        ans.remove((Integer)2);//指定对象是删除
        System.out.println("删除后：ans="+ans);
        ans.remove(2);//指定索引删除
        System.out.println("删除后：ans="+ans);
        //public E set(int index,E element)
        ans.set(1,12);//设置索引值为1的数据内容
        System.out.println("修改后：ans="+ans);
        //public E get(int index)
        System.out.println("索引位置为2的数据内容是:"+ans.get(2));
        //public int size()返回此列表中的元素数。
        System.out.println("ArrayList 的大小是"+ans.size());
    }
}
