package cn.gpns.day07.demo03;

import java.util.Random;

/*
Random类用来生成随机数字，使用起来也是三个步骤：
1.导包
import java.util.Random

2.创建
Random r = new Random();//小括号中留空即可

3.使用
获取一个随机的int数字(范围是int所有范围，有正负两种)：int num = r.nextInt();
获取一个随机的int数字(参数代表了范围,左闭右开空间)：int num = r.next(3);
实际代表的含义；[0,3),也就是0到2
 */
public class Demo01Random {
    public static void main( String[] args ) {
        Random  r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是多少："+num);
    }
}
