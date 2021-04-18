package demo14;

import java.util.ArrayList;

public class Main {
    public static void main( String[] args ) {
        Manager manager = new Manager("群主",100);

        Number one = new Number("成员A",0);
        Number two = new Number("成员B",0);
        Number three = new Number("成员C",0);

        manager.show();

        one.show();
        two.show();
        three.show();
        System.out.println("===============");

        ArrayList<Integer> redlist = manager.sand(20,3);

        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);
        manager.show();

        one.show();
        two.show();
        three.show();
        System.out.println("===============");
    }
}
