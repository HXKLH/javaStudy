package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main( String[] args ) {
        Student stu1 = new Student();
        System.out.println("===================");
        Student stu2 = new Student("赵丽颖",20);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
