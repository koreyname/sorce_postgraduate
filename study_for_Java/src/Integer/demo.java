package Integer;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        Integer integer=Integer.valueOf(12);
//        System.out.println(integer);
//        //int转String
//        String s1=""+integer;
//        System.out.println(s1);
//        //方式二
//        String s2=String.valueOf(integer);
//        System.out.println(s2);
//        //方式三
//        String s3=Integer.toString(integer);
//        System.out.println(s3);
//        //String -->int
//        //String-->integer-->int
//        Integer i=Integer.valueOf(s3);
//        int k=i.intValue();
//        System.out.println(k);
//        //String -->int
//        k=Integer.parseInt(s3);
//        System.out.println(k);
        //案例字符串数据排序
        String s="22 32 12 66 64";
        System.out.println("排序前:"+s);
        String []sans=s.split(" ");//分割数组
        int []san=new int[sans.length];
        for(int i=0;i< sans.length;i++)
        {
            san[i]=Integer.parseInt(sans[i]);
        }
        Arrays.sort(san);
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<san.length;i++)
        {
            s2.append(san[i]+" ");
        }
        System.out.println("排序后:"+s2);
    }
}
