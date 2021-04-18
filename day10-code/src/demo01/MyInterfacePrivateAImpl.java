package demo01;

import org.junit.Test;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{
    @Test
    public void methodAnothwer(){
//        methodCommon();

        System.out.println("=========");
        methodDefault1();

        System.out.println("=========");
        methodDefault2();


    }
}
