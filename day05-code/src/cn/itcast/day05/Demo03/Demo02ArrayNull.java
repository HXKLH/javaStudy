package cn.itcast.day05.Demo03;
/*
所有引用类型变量，都可以赋值为一个null值，但是其代表什么都没有

数组必须进行new，才能使用其中的元素
如果只是一个赋值了null，没有进行new创建
那么将会发生，
空指针异常NullPointerException
 */
public class Demo02ArrayNull {
    public static void main( String[] args ) {
        int[] array  = null;
//        array = new int[3];
        System.out.println(array[0]);
    }
}
