package cn.itcast.day06.demo04;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建负刑事，其实就是在调用构造方法
格式：
public void 类名称(参数名称){
    方法体
}

注意事项：
1.构造方法的名称必须和类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值，连void都不要写
3.构造方法中不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会，默认赠送一个构造方法，没有参数、方法体什么事情的都不做。
public Student（）{}
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
 */
public class Student {
//    public Student(){
//        System.out.println("构造方法执行了");
//    }
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student(){
        System.out.println("无参构造方法执行了!");
    }

    //全参构造方法
    public Student(String name ,int age){
        System.out.println("全参构造方法执行了!");
        this.name = name;
        this.age =age;
    }


    //Getter、Setter方法
    /**
     * Gets the value of name. *
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name. *
     * <p>You can use getName() to get the value of name</p>
     * * @param name name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge( int age ) {
        this.age = age;
    }
}
