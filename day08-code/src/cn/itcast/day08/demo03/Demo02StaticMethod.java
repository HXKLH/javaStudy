package cn.itcast.day08.demo03;
/*
如果一个成员变量使用的static关键字，那么这个变量不在属于兑现自己，而是属于类，多个变量共享同一份数据。

如果没有static关键词，那么首先创建兑现，然后通过对象才能使用它。
如果有了static关键字，那么不需要创建对象，直接通过类名就能来使用它。

无论成员变量还是成员方法，如果有了static，都推荐使用类名称来调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法();

注意：1.静态不能直接访问非静态
原因：在内存中是先有【先】静态内容，后有【后】非静态内容。
“先人不知道后人，后人知道先人。”
    2.静态方法中不能使用this
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
 */
public class Demo02StaticMethod {
    public static void main( String[] args ) {
        MyClass obj = new MyClass();  //首先创建对象
        //然后才能使用没有Static关键词的内容
        obj.mehtod();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名来调用。
        obj.methodStatic();//正确，不推荐，这种写法在编译之后也会被javac翻译成为“类名称.静态方法名”
        MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效
    }
    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
