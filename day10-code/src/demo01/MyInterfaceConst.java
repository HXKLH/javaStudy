package demo01;

/*
接口当中也可以定义“成员变量”，但时必须用public static final三个关键次词来修饰
从效果上看，这其实就是接口的【常量】。
格式：
public static final 数据类型 常量名称 = 数据值；

1.接口中的常量可以省略public static final，注意：不写也照样是这样
2.接口中的常量必须赋值；不能不进行赋值
3.接口中常量的名称，使用完全大写，用下划线进行分隔。
 */
public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，说明不可更改
    public static final int NUM_OF_MY_CLASS = 12;

}
