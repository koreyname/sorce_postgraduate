package Object_Class;

public class demo {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//Object类的toString方法
    @Override
    public String toString() {
        return "我的名字是"+getName()+"\n"+"我的年龄是:"+getAge();
    }
}
