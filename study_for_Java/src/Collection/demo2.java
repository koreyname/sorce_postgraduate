package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("HELLO");
        l.add("WORLD");
        System.out.println(l);
        Iterator<String> it=l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //还有和ArrayList一样的方法
    }
}
