package ArrayList;

import java.lang.reflect.Array;
import java.util.*;
public class Array_modle {//就是数组
    public static void main(String[] args) {
        //public static void sort(long[] a)
//        public static String toString(int[] a)

        //public static int binarySearch(double[] a,
        //                               double key)
        //copyOf
        //public static <T,U> T[] copyOf(U[] original,
        //                               int newLength,
        //                               Class<? extends T[]> newType)
        int ans[]={12,22,9,99,67};
        System.out.println("排序前:"+Arrays.toString(ans));
        Arrays.sort(ans);
        System.out.println("排序后："+Arrays.toString(ans));
        int bns[]=Arrays.copyOf(ans,ans.length);
        System.out.println("bns是:"+Arrays.toString(bns));
        if(Arrays.binarySearch(ans,0)!=-1)
        {
            System.out.println("找到了");
        }
        else {
            System.out.println("没找到");
        }
    }
}
