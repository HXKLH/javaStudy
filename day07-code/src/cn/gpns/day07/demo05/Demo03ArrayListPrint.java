package cn.gpns.day07.demo05;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
题目：
定义一指定格式打印集合的方法（ArrayList类型作为参数）使用（）括起集合，使用@分隔每一个元素
格式参照{元素@元素@元素}。

System.out.println(list);     [10, 20, 30]
printArrayList(list);         {10@20@30}

 */
public class Demo03ArrayListPrint {
    public static void main( String[] args ) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        printArrayList(array);
    }

    public static void printArrayList(ArrayList<Integer> array){
        System.out.print("{");
        for (int i = 0; i < array.size(); i++) {
            if(i == array.size()-1){
                System.out.print(array.get(i)+"}");
            }else {
                System.out.print(array.get(i)+"@");
            }
        }
    }
}
