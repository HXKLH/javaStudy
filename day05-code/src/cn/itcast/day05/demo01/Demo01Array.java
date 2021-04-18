package cn.itcast.day05.demo01;

/*
数组：是一种容器，可以同时存放多个数据值

数组的特点：
1、数组是一种引用数据类型
2、数组中的多个数据，类型必须同一
3、数组长度在程序运行期间不可改变

数组的初始化
1、动态初始化（指定长度）
格式：
数据类型[] 数组名称 = new 数据类型[数组长度]

2、静初始化（指定内容）

 */
public class Demo01Array {
    public static void main( String[] args ) {
        //创建一个数组，里面能存放300个int数据
        int[] array1 = new int[300];

        //创建一个数组，能存放10个double类型的数据
        double[] array2 = new double[10];

        //创建一个数组能存放5个String类型的数据
        String[] array3 = new String[5];


    }
}
