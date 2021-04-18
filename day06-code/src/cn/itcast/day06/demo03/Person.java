package cn.itcast.day06.demo03;

/*
问题描述：定义Person的年龄时候，无法阻止不合理的数值被设置进来。
解决方案：用private关键词将需要保护的成员变量进行修饰。

一旦使用private进行修饰，那么本类中任然可以随意访问。
但是!超过本类范围之外就不能再直接访问了。

间接访问private成员变量，就是定义一对Getter/Setter方法

必须叫setXxx或者是getXxx命名规则
对于Getter来说，不能有参数，返回值类型要和成员变量类型一样
对于Setter来说，不能有返回值类型，参数类型要和成员变量类型对应
 */
public class Person {
    String name;//年龄
    private int age;//年龄

    public void show() {
        System.out.println("我叫" + name + ",年龄：" + age);
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge( int age ) {
        if (age < 100 && age >= 0) {
            this.age = age;
        }else{
            System.out.println("数据不合理");
        }

    }


    //这个成员方法，专门用于获取age数据
    public int getAge() {
        return this.age;
    }

}
