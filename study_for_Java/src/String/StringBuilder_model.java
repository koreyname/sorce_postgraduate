package String;

public class StringBuilder_model {
    public static void main(String[] args) {
        //StringBuilder 的内容可变
        //例如

        //public StringBuilder();
        StringBuilder sbd=new StringBuilder("abd");
        //        public StringBuilder(char []ch)
            char[] ch={'a','b','c'};
        StringBuilder sbd2=new StringBuilder(sbd);
        sbd.append(" Hello");
        System.out.println(sbd);


    }
}
