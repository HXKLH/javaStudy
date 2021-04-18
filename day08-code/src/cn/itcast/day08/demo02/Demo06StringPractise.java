package cn.itcast.day08.demo02;

/*
题目：
定义一个方法，把数组{1, 2, 3}按照指定的格式拼接成一个字符串。格式参照如下：[word1#word2#word3].
 */
public class Demo06StringPractise {
    public static void main( String[] args ) {
        String[] strings = {"何丽", "张三", "李四"};
        System.out.println(stringPractise(strings));

    }

    public static String stringPractise( String[] strings ) {
        String str = "[";
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                str = str.concat(strings[i]) + "]";
            } else {
                str = str.concat(strings[i]) + "#";
            }
        }
        return str;
    }

}
