package cn.gpns.day07.demo04;

import java.util.ArrayList;
/*
如果希望向ArrayList当中存储基本数据类型，必须使用基本类型的“包装类”
基本类型：       包装类（引用类型，包装类型都位于java.lang包下）
byte            Byte
short           Short
int             Integer【特殊】
long            Long
float           Float
double          Double
char            Character【特殊】
boolean         Boolean

从JDK1.5开始支持自动装箱、拆箱
自动装箱 ：基本数据类型 -------> 封装数据类型
自动拆箱 ：封装数据类型 ------->基本数据类型

 */
public class Demo04ArrayListEach {
    public static void main( String[] args ) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);

        Integer num = list.get(1);
        System.out.println("第一号元素是："+num);
    }
}
