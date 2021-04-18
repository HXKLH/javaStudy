package demo01;

/*
在任何版本的java中，接口都能定义抽象方法。

public abstract 返回值类型 方法名称（参数列表）；
1、接口中的抽象类方法，修饰符必须是固定的两个关键词：public ，abstract
2、这两个 关键词可以选择性省略
3、方法的三要素可以随意定义
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract  void methodAbs1();

    //这也是抽象方法
    abstract  void methodAbs2();

    //这也是抽象方法
    public void methodAbs3();

    //这也是抽象方法
    void  methodAbs4();

}
