package demo01;

public class MyInterfaceDefaltB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodAbs2() {
        System.out.println("实现类B进行了接口的默认方法重写");
    }
}
