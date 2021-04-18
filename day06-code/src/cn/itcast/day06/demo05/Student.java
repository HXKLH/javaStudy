package cn.itcast.day06.demo05;
/*
一个标准类通常要拥有下面四个组成部分：

1.所有成员变量都要使用private关键字来修饰
2.为每一成员变量编写一对Getter/Setter方法
3.编写一个无参构造方法
4.编写一个全餐构造方法

这样标准的类也叫作 java Bean
 */

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student( String name, int age ) {
        this.name = name;
        this.age = age;
    }

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
