package cn.itcast.day05.demo01;
/*
动态初始化：在创建数组的时候，直接指定数组当中的数据元素的个数
静态初始化：在创建数组的时候，不直接指定元素个数的多少，而是直接将具体的数据内容进行指定。

静态初始化基本格式：
数据类型[] 数组名称 = new 数据类型[]{元素一，元素二，......}
 */
public class Demo02Array {
    public static void main( String[] args ) {
        //直接创建一个数组，里面装的全是int数字，具体为：5，15，25，40
        int[] arrayA = new int[]{5,15,25,40};



        //创建一个数组用来装字符串："Hello“,”World“,"Java”
        String[] arrayB=new String[]{"Hello","World","Java"};
    }
}
