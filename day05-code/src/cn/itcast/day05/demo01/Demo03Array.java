package cn.itcast.day05.demo01;

/*
静态初始化省略格式：
数据类型[] 数组名称 = {元素1,元素2,.......}

注意事项：
1.静态初始化没有指定数组长度，但是仍然会自动推算得到长度
2.静态初始化标准格式可以拆分成为2个步骤
3.动态初始也可以拆分成2个步骤
4.静态初始化一旦使用省略格式，则不能拆分成2个步骤了

使用建议：
如果不确定数组当中的具体内容，用动态初化；否则，已经确定了具体内容，用静态初始化。
 */
public class Demo03Array {
    public static void main( String[] args ) {

        //省略格式
        int[] arrayA = {10, 23, 30};

        //静态初始化标准格式可以拆分成两个步骤
        int[] arrayB;
        arrayB = new int[]{11, 21, 31};

        //动态初始化也可以拆分成 两个步骤
        int[] arrayC;
        arrayC = new int[10];

        //静态初始化省略步骤不能被拆分成2个步骤
//        int[] arrayD;
//        arrayD = {20, 32, 40};
    }
}