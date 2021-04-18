package demo01;

/**
 * 1. 接口的默认方法，可以通过接口实现类对象，直接调用
 * 2.接口的默认方法，也可以被实现类进行覆盖重写。
 */
public class Demo02Interface {
    public static void main( String[] args ) {
        MyInterfaceDefaltA A = new MyInterfaceDefaltA();
        A.methodAbs();//调用抽象方法，实际运行的是右侧实现类
        A.methodAbs2();

        System.out.println("==============");
        MyInterfaceDefaltB b = new MyInterfaceDefaltB();
        b.methodAbs2();
    }
}
