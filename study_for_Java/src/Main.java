import UnName.Inter;

public class Main {
    public static void main(String[] args) {

//        int ans[]={22,12,34,56,78,99};
//      for(int i=0;i<ans.length;i++)
//        System.out.print(ans[i]+" ");
//        System.out.println("");
//        bubble_sort(ans);
//        for(int i=0;i<ans.length;i++)
//            System.out.print(ans[i]+" ");
        Integer a=10;
        Integer b=20;
        System.out.println(a+","+b);
        swap(a,b);
        System.out.println(a+","+b);

    }
    public static void swap(Integer a,Integer b)
    {
        Integer k=new Integer(a);
        a=new Integer(b);
        b=k;

    }

    public static void bubble_sort(int []ans)
    {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans.length-i-1;j++)
            {
                if(ans[j]>ans[j+1])
                {
                    int k=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=k;
                }
            }
        }
    }
}