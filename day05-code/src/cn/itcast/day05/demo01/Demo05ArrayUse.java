package cn.itcast.day05.demo01;

/*
使用动态初始化数组的时候，其中的元素会主动拥有一个默认值。规则如下：
1.如果是整数类型，那么默认值为0
2.如果是float类型，那么默认值为0.0
3.如果是char类型，那么默认值为‘/u0000'
4.如果是boolean类型，那么默认为false
5.如果是应用类型，那么默认为null

注意事项：
静态初始化也有默认值过程，只不过系统自动马上将默认值替换成了大括号中的具体数值。
 */
public class Demo05ArrayUse {
    public static void main( String[] args ) {
        //动态初始化一个数组
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
