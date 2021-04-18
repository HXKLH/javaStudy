package demo01;

/*
从java8开始，接口里允许定义默认方法。
格式：
public defualt 返回值类型 方法名称（参数列表）{
    方法体
}
备注：接口中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添加了一个抽象方法
    //public abstract void methodAbs2();

    //新添加的方法改成默认方法
    public default void methodAbs2(){
        System.out.println("这是新添加的一个默认方法");
    };

}
