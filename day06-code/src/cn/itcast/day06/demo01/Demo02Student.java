package cn.itcast.day06.demo01;
/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称
import cn.itcast.day06.demo01.Student;
对于和当前类统一包的情况，可以省略导包语句不写

2.创建
类名 对象名 = new 类名称();
Student stu = new Student();

3.使用
使用成员变量: 对象名.成员变量名
使用成员方法:对象名.成员方法名(参数);
(也就是，想用谁，就用对象名点谁)

注意事项:
如果成员变量没有进行赋值，那么将会有一个默认值，规则个数组一样
 */
public class Demo02Student {
    public static void main( String[] args ) {

//        1.导包：也就是指出需要使用的类，在什么位置。
//        对于和当前类统一包的情况，可以省略导包语句不写

//        2.创建
//        类名 对象名 = new 类名称();
        Student stu = new Student();

//        3.使用
//        使用成员变量: 对象名.成员变量名
//        使用成员方法:对象名.成员方法名(参数);
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("=============");

//        改变对象中的成员变量数值内容
//        将右侧的字符串，赋值交给stu对象中的name成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("================");

//        4.使用对象的成员方法，格式
//        对象名，成员方法名
        stu.eat();
        stu.sleep();
        stu.study();


    }

}
