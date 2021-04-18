package cn.gpns.day07.demo05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历
 */
public class Demo02ArrayListStudent {
    public static void main( String[] args ) {
        ArrayList<Student> array = new ArrayList<>();
        Student stu1 = new Student("张三",10);
        Student stu2 = new Student("李四",20);
        Student stu3 = new Student("王五",30);
        Student stu4 = new Student("赵六",35);

        array.add(stu1);
        array.add(stu2);
        array.add(stu3);
        array.add(stu4);

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println("姓名："+student.getName()+",年龄："+student.getAge());
        }
    }
}
