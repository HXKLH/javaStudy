package cn.gpns.day07.demo04;
/*
题目：定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {
    public static void main( String[] args ) {
        //首先创建一个长度为3的数组，用来存放Person类型的对象
        Person[] persons = new Person[3];
        Person person1 = new Person("迪丽热巴",18);
        Person person2 = new Person("古力娜扎",28);
        Person person3 = new Person("马尔扎哈",38);

        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;

        System.out.println(persons[0]);
        System.out.println(persons[1]);
        System.out.println(persons[2]);

        System.out.println(persons[1].getName());


    }

}
